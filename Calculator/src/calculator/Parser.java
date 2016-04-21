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

//    public int eval(Reader program) throws Exception {
//
//        int sum = 0;
//        while (l.hasNext()) {
//            Token t = l.next();
//            if (t instanceof lexer.TokenNumber) {
//                TokenNumber tn = (TokenNumber) t;
//                sum += tn.getValue();
//            }
//        }
//        return sum;
//    }
    private int number() throws ParseExpression {
        Token t = l.next();
        if (!(t instanceof lexer.TokenNumber)) {
            throw new ParseExpression("number expected: " + t);
        }
        TokenNumber tn = (TokenNumber) t;
        return tn.getValue();
    }

    int term() throws ParseExpression {
        int sum = number();
        while (l.hasNext()) {
            Token operator = l.next();
            if (operator.getTe() == TokenEnum.PLUS) {
                sum += number();
            } else if (operator.getTe() == TokenEnum.MINUS) {
                sum -= number();
            } else {
                throw new ParseExpression("additive operator expected: " + operator);
            }

        }
        return sum;
    }

}
