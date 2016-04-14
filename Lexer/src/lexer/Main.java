/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author danecek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Reader r = new StringReader("12  + while xxx yy 23    ");
        Lexer l = new Lexer(r);

        while (l.hasNext()) {
            Token t = l.next();
            System.out.println(t);
        }

    }

}
