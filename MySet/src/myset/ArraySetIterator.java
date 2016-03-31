/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myset;

import java.util.Iterator;

class ArraySetIterator implements Iterator<Integer> {

    private ArraySet as;
    private int pos;

    public ArraySetIterator(ArraySet aThis) {
        as = aThis;
    }

    @Override
    public boolean hasNext() {
        return pos < as.size();
    }

    @Override
    public Integer next() {
        return as.data[pos++];
    }

}
