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
public class LinkedList {  // unmodifiable list

    private final Node head;

    public LinkedList() {
        head = null;
    }

    private LinkedList(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public LinkedList add(int newValue) {
        return new LinkedList(new Node(newValue, head));
    }

    public LinkedList tail() {
        if (isEmpty()) {
            throw new IllegalStateException("empty list");
        }
        return new LinkedList(head.getNextNode());
    }

    public LinkedList append(LinkedList appending) {
        if (isEmpty()) {
            return appending;
        } else {
            return tail().append(appending).add(head.getValue());
        }

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
