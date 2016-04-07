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
public class AssignOp extends BinOp {

    public AssignOp(Var left, Expr right) {
        super(Integer.MIN_VALUE, '=', left, right);
    }

    @Override
    int eval() throws UndefinedValueException {
       int v= right.eval();
       Memory.instance.store((Var) left, v);
       return v;
    }
    
}
