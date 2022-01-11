package datastructures.trees.binarytree.problems.levelorder.methodapproach;

public class Demo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();//root is null
        /* Let us create following BST
              1
           /     \
          2      3
         /  \
       4   5
         */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Level order traversal of binary tree is : ");
        tree.printLevelOrder();
        System.out.println("TC = O(n^2)");

    }


}
