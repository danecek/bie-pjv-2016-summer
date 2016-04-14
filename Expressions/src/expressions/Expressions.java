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

    public static void main(String[] args) {

        try {
            Var sum = new Var("sum");
            new AssignOp(sum, new Num(0)).eval();

            Var x = new Var("x");
            new AssignOp(x, new Num(10)).eval();
            While w = new While(new MinusMinus(x), new AssignOp(sum, new AddOp('+', x, sum)));
            w.eval();
            System.out.println(sum.eval());

// TODO code application logic here
        } catch (UndefinedValueException ex) {
            System.out.println(ex);
        }
    }

}
