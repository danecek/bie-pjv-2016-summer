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
public class TokenName extends Token {
    String value;

    public TokenName(String value) {
        super(TokenEnum.NAME);
        this.value = value;
    }

    @Override
    public String toString() {
        return "TokenName{" + "value=" + value + '}';
    }
    
}
