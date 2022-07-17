package DSAJAVA.Tree.BinaryTree;
/**
 * Balanced Height Tree
 * For Each Node, The Difference between the heights of the left subTree & right subTree <= 1
 */
public class BalancedHeightTree<T> extends LevelOrderTreeBuild<T>{

    public int heightOfTree(Node<T> root){
        if (root==null)
            return 0;

        return Math.max(heightOfTree(root.left),heightOfTree(root.right)) + 1;
    }

    public boolean isBalanced(Node<T> root){
        if (root==null)
            return true;

        boolean leftBoolean=isBalanced(root.left);
        boolean rightBoolean=isBalanced(root.right);

        if (!leftBoolean)
            return false;
        if (!rightBoolean)
            return false;

        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        return (leftHeight - rightHeight) <= 1;
    }
}
