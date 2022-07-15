package DSAJAVA.Tree.BinaryTree;

public class PreOrderPrint<T> extends PreOrderTreeBuilt<T> {

    public void printRecursive(Node<T> root){//PreOrder Traversal
        if (root==null)
            return;
        System.out.println(root.data);
        printRecursive(root.left);
        printRecursive(root.right);
    }
}
