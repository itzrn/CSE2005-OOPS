package DSAJAVA.Tree.BinaryTree;

public class PostOrderPrint<T> extends LevelOrderTreeBuilt<T> {

    public void printRecursive(Node<T> root){//Post Order Traversal
        if (root==null)
            return;

        printRecursive(root.left);
        printRecursive(root.right);
        System.out.println(root.data);
    }
}
