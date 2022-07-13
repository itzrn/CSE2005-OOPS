package DSAJAVA.Tree.BinaryTree;

public class Height<T> extends LevelOrder<T> {//search of iterative way

    public int heightOfTree(Node<T> root){
        if (root==null)
            return 0;

        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        //     Math.max(leftHeight,rightHeight) + 1;
    }

    public int heightOfTree(){
        return heightOfTree(root);
    }
}