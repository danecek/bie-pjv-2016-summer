/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myset;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ArraySet implements Set<Integer> {

    Integer[] data;
    private int size = 0;

    public ArraySet(int size) {
        data = new Integer[size];
    }

    public ArraySet() {
        this(1000);
    }

    public int totalSum() {
        int totalSum = 0;
        for (Integer i : this) {
            totalSum += i;
        }
        return totalSum;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Integer e) {
        if (isFull()) {
            throw new RuntimeException("full");
        }
        if (contains(e)) {
            return false;
        }
        data[size++] = e;
        return true;
    }

    public boolean isFull() {
        return size() == data.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return find(o) >= 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArraySetIterator(this);
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int find(Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        Integer e = (Integer) o;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        int i = find(o);
        if (i < 0) {
            return false;
        }
        data[i] = data[size - 1];
        data[--size] = null;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

//    private class InnerArraySetIterator implements Iterator<Integer> {
//
//        int pos = 0;
//
//        @Override
//        public boolean hasNext() {
//        }
//
//        @Override
//        public Integer next() {
//            return data[pos]
//        }
//
//    }

}
