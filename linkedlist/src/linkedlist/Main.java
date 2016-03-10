/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList().add(1).add(2).add(8);
        LinkedList ll2 = new LinkedList().add(3).add(4);
        System.out.printf("%s + %s = %s\n", ll1, ll2,  ll1.append(ll2));
    }

}
