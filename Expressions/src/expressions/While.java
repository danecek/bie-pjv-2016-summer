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
public class While extends Expr {

    Expr test;
    Expr[] exprs;

    public While(Expr test, Expr... exprs) {
        super(0);
        this.exprs = exprs;
        this.test = test;
    }

    @Override
    int eval() throws UndefinedValueException {
        int result = 0;
        while (test.eval() != 0) {
            for (Expr e : exprs) {
                result = e.eval();
            }
        }
        return result;
    }

}
