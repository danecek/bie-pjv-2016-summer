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
public abstract class Expr {

    abstract int eval();
    int priority;

    public Expr(int priority) {
        this.priority = priority;
    }
    
   // abstract Expr optimize();

}
