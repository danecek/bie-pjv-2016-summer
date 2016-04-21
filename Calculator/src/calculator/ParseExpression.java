/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author danecek
 */
class ParseExpression extends Exception {

    public ParseExpression(String invalid_program) {
        super(invalid_program);
    }
    
}
