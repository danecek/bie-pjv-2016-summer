/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

public abstract class Expr {

    abstract int eval() throws UndefinedValueException;
    int priority;

    public Expr(int priority) {
        this.priority = priority;
    }
    

}
