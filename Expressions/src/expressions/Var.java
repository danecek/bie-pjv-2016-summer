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
public class Var extends Expr {

    public Var(String name) {
        super(1);
    }

    @Override
    int eval() {
       return 1;
    }
    
}
