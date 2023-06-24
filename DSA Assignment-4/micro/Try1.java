package micro;
//It is the basic code to create and connect the nodes together in a Linked List

//Here's how you can create a class called Node:
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Try1 {
    public static void main(String[] args) {

        // create nodes
        Node node1 = new Node(11);
        Node node2 = new Node(18);
        Node node3 = new Node(24);

        node1.next = node2;
        node2.next = node3;

        // Traversing the linked list
        Node current = node1;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
