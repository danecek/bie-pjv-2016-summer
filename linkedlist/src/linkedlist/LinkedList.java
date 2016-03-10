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
public class LinkedList {

    private Node head;

    public void add(int newValue) {
        head = new Node(newValue, getHead());
    }
    
    public LinkedList createByAppend(LinkedList app) {
        
    }
    
    public void updateByAppend(LinkedList app) {
        
    }

    public int size() {
        int counter = 0;
        for (Node p = head; p != null; p = p.getNextNode()) {
            counter++;
        }
        return counter;

    }

    public Node getHead() {
        return head;
    }

    private static boolean isLastNode(Node p) {
        return p.getNextNode() == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Linkedlist(");
        for (Node p = head; p != null; p = p.getNextNode()) {
            sb.append(p.getValue());
            if (!isLastNode(p)) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

}
