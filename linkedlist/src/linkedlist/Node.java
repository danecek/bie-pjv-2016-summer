package linkedlist;

public class Node {

    private final int value;
    private final Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }


    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node(" +  value + ')';
    }
  
    

}
