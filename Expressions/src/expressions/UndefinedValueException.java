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
public class UndefinedValueException extends Exception {

    public UndefinedValueException(Var v) {
        super(v + " is undefined");
    }

}
