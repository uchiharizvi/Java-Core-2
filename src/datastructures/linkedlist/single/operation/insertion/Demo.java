package datastructures.linkedlist.single.operation.insertion;

public class Demo {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.printList();
    }
}
