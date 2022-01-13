package datastructures.linkedlist.single.operation;

public class LinkedList {
    Node head;

    /**
     * Push in front of list
     */
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * Add after a node
     **/
    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) return;
        Node node = new Node(data);
        node.next = previousNode.next;
        previousNode.next = node;
    }

    /**
     * Add Node at the end
     **/
    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = node;
        return;
    }

    public void delete(int data) {
        Node temp = head, previous = null;

    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
