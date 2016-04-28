/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.io.Reader;
import javax.naming.PartialResultException;
import lexer.Lexer;
import lexer.Token;
import lexer.TokenEnum;
import lexer.TokenNumber;

/**
 *
 * @author danecek
 */
public class Parser {

    private Lexer l;

    public Parser(Reader program) throws IOException {
        l = new Lexer(program);
    }


    private int number() throws ParseException {
        Token t = l.next();
        if (!(t instanceof lexer.TokenNumber)) {
            throw new ParseException("number expected: " + t);
        }
        TokenNumber tn = (TokenNumber) t;
        return tn.getValue();
    }

    int term() throws ParseException {
        int sum = number();
        while (l.hasNext()) {
            Token operator = l.next();
            if (operator.getTe() == TokenEnum.PLUS) {
                sum += number();
            } else if (operator.getTe() == TokenEnum.MINUS) {
                sum -= number();
            } else {
                throw new ParseException("additive operator expected: " + operator);
            }

        }
        return sum;
    }

}
