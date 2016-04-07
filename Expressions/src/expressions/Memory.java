/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Memory {

    private static final Logger LOG = Logger.getLogger(Memory.class.getName());

    public static final Memory instance = new Memory();

    private Memory() {
    }

    private Map<Var, Integer> data = new HashMap<>();

    public void store(Var v, int value) {
        LOG.info("To the" + v + " is asigned " + value);
        data.put(v, value);
    }

    public int load(Var v) throws UndefinedValueException {
        Integer value = data.get(v);
        if (value == null) {
            throw new UndefinedValueException(v);
        }
        return value;/// value.intValue();
    }

}
