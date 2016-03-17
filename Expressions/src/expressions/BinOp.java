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
public abstract class BinOp extends Expr {

    Expr left;
    Expr right;
    char op;
    
    public BinOp(int priority, char op, Expr left, Expr right) {
        super(priority);
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + op + right.toString() +")";
    }

}
