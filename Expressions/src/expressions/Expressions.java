/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author danecek
 */
public class Expressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Expr e = new MltOp('*', new AddOp('+', new Num(1), new Num(2)), new Num(3));
        System.out.println(e.eval());
        System.out.println(e);
        // TODO code application logic here
    }

}
