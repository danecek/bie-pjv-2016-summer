/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lexer extends Reader implements Iterator<Token> {

    Reader reader;
    boolean eof = false;
    char actualChar;

    public Lexer(Reader reader) throws IOException {
        this.reader = reader;
        nextChar();
    }

    private void nextChar() throws IOException {
        int x = reader.read();
        if (x < 0) {
            eof = true;
            actualChar = 0;
        } else {
            actualChar = (char) x;
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

    @Override
    public Token next() {
        Token t = nextToken();
        skipWhiteSps();
        return t;
    }

    private Token nextToken() {
        try {
            if (Character.isDigit(actualChar)) {
                return digit();
            } else if (Character.isLetter(actualChar)) {
                return name();
            } else {
                switch (actualChar) {
                    case '+': {
                        nextChar();
                        return new Token(TokenEnum.PLUS);
                    }
                    case '-': {
                        nextChar();
                        return new Token(TokenEnum.MINUS);
                    }
                    case '*': {
                        nextChar();
                        return new Token(TokenEnum.MLT);
                    }
                    case '/': {
                        nextChar();
                        return new Token(TokenEnum.DIV);
                    }
                    default:
                        throw new LexerException("invalid character");
                }
            }
        } catch (IOException ex) {
            throw new LexerException(ex);
        }
    }

    @Override
    public boolean hasNext() {
        return !eof;
    }

    private Token digit() throws IOException {
        int value = 0;
        while (Character.isDigit(actualChar)) {
            value = value * 10 + (actualChar - '0');
            nextChar();
        }
        return new TokenNumber(value);
    }

    private Token name() throws IOException {
        StringBuilder sb = new StringBuilder(actualChar);
        while (Character.isLetterOrDigit(actualChar)) {
            sb.append(actualChar);
            nextChar();
        }
        String s = sb.toString();
        try {
            return new Token(TokenEnum.valueOf(s));
        } catch (IllegalArgumentException ex) {
            return new TokenName(s);
        }

    }

    private void skipWhiteSps() {
        while (Character.isWhitespace(actualChar)) {
            try {
                nextChar();
            } catch (IOException ex) {
                throw new LexerException(ex);
            }

        }
    }

}
