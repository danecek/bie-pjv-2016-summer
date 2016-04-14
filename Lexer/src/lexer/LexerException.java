/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

import java.io.IOException;

/**
 *
 * @author danecek
 */
class LexerException extends RuntimeException {

    public LexerException(IOException ex) {
        super(ex);
    }

    public LexerException(String message) {
        super(message);
    }
    
}
