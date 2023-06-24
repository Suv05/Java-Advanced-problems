package micro1;
//1st insertion operation at the beginning
 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class LinkedList {
    public static Node insertAtBeginning(Node start, int newData) {
        Node newNode = new Node(newData);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }

        return start;
    }
}

public class Try2 {
    public static void main(String[] args) {

    }
}
