/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

import java.util.Objects;

public class Var extends Expr {

    private final String name;

    public Var(String name) {
        super(1);
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != Var.class) {
            return false;
        }
        Var v = (Var) obj;
        return name == v.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    int eval() throws UndefinedValueException {
        return Memory.instance.load(this);
    }

    @Override
    public String toString() {
        return "Var{" + name + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}
