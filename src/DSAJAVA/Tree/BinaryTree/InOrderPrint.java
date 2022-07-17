package DSAJAVA.Tree.BinaryTree;

public class InOrderPrint<T> extends LevelOrderTreeBuild<T> {

    public void printRecursive(Node<T> root){//InOrder Traversal
        if (root==null)
            return;

        printRecursive(root.left);
        System.out.println(root.data);
        printRecursive(root.right);
    }
}
