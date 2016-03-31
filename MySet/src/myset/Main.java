/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author danecek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArraySet set = new ArraySet();
        set.add(1);
        System.out.println(set);
        set.clear();
        System.out.println(set);
        set.add(2);
        System.out.println(set.totalSum());
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.totalSum());

//        for (Integer i : set) {
//            System.out.println(i);
//        }
    }

}
