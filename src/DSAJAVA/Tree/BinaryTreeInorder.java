package DSAJAVA.Tree;

public class BinaryTreeInorder<T> extends BinaryTreePreOrder<T> {
    @Override
    public void print(Node<T> root){
        if (root==null)
            return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
}