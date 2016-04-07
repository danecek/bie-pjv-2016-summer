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
public class Num extends Expr {

    public Num(int value) {
        super(Integer.MAX_VALUE);
        this.value = value;
    }

    int value;

    @Override
    int eval() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}
