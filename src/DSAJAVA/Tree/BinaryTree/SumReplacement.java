package DSAJAVA.Tree.BinaryTree;

public class SumReplacement extends LevelOrderTreeBuild<Integer> {

    int sum;

    public void sum(Node<Integer> root){
        if (root==null)
            return;

        sum=sum+root.data;
        sum(root.left);
        sum(root.right);
    }

    public void sumReplacement(Node<Integer> root){
        if (root==null)
            return;

        sum=0;
        sum(root);
        root.data=sum;
        sumReplacement(root.left);
        sumReplacement(root.right);
    }
}
