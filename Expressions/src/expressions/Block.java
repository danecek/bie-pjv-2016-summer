/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

import java.util.List;

/**
 *
 * @author danecek
 */
public class Block extends Expr {
    List<Expr> expres;

    public Block(int priority) {
        super(priority);
    }

    @Override
    int eval() throws UndefinedValueException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
