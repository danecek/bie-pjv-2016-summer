/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class Expressions {

    public static void main(String[] args) {

        try {
            //        //Expr e = new MltOp('*', new AddOp('+', new Num(1), new Num(2)), new Num(3));
//        Var v = new Var("v1");
//        AssignOp e1 = new AssignOp(v, new Num(1));
//        System.out.println(e1.eval());
//        AssignOp e2 = new AssignOp(v, new Num(2));
//        System.out.println(e2.eval());
//        System.out.println(Memory.instance.load(v));
//            Expr e3 = new AddOp('+', new Var("x"), new Num(0));
            AssignOp e = new AssignOp(new Var("x"), new Num(3));
            e.eval();
            System.out.println(new Var("x").eval());

// TODO code application logic here
        } catch (UndefinedValueException ex) {
            System.out.println(ex);
        }
    }

}
