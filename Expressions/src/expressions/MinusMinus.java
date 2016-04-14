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
public class MinusMinus extends Expr {

    Var var;

    public MinusMinus(Var var) {
        super(0);
        this.var = var;
    }

    @Override
    int eval() throws UndefinedValueException {
        Memory.instance.store(var, var.eval() - 1);
        return var.eval();
    }

}
