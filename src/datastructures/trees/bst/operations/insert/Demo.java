package datastructures.trees.bst.operations.insert;

public class Demo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
    }
}
