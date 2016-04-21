/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author danecek
 */
public class Token {

    private TokenEnum te;

    public Token(TokenEnum te) {
        this.te = te;
    }

    @Override
    public String toString() {
        return "Token{" + "te=" + te + '}';
    }

    /**
     * @return the te
     */
    public TokenEnum getTe() {
        return te;
    }
}
