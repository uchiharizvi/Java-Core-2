package datastructures.linkedlist.single.operation.insertion;

public class LinkedList {
    Node head;

    /*Push in front of list*/
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) return;
        Node node = new Node(data);
        node.next = previousNode.next;
        previousNode.next = node;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
