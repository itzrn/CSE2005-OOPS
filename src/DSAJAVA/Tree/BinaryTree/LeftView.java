package DSAJAVA.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView<T> extends LevelOrderTreeBuild<T>{

    public void leftView(){
        if (root==null)
            return;

        Queue<Node<T>> queue=new LinkedList<>();
        queue.add(null);
        queue.add(root);

        Node<T> temp;
        while (!queue.isEmpty()){
            temp=queue.remove();
            if (temp==null){
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().data);
                    queue.add(null);
                }
            }else {
                if (temp.left!=null)
                    queue.add(temp.left);
                if (temp.right!=null)
                    queue.add(temp.right);
            }
        }
    }
}
