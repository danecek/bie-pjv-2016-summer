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
public class TokenNumber extends Token {

    int value;
    
    public TokenNumber(int value) {
        super(TokenEnum.NUMBER);
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "TokenNumber{" + "value=" + value + '}';
    }
    
}
