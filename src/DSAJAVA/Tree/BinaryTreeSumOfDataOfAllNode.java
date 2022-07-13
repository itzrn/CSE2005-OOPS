package DSAJAVA.Tree;

import java.util.Stack;

public class BinaryTreeSumOfDataOfAllNode extends BinaryTreeLevelOrder<Integer> {

    public Integer sumRecursive(Node<Integer> root){
        if (root==null)
            return 0;
        return sumRecursive(root.left) + sumRecursive(root.right) + root.data;
    }

    public Integer sumIterative(){
        if (root==null)//this root is of Tree class
            return 0;

        int count=0;
        Stack<Node<Integer>> stack=new Stack<>();
        stack.push(root);
        Node<Integer> temp;
        while (!stack.empty()){
            temp=stack.pop();
            count=count+ temp.data;
            if (temp.left!=null)
                stack.push(temp.left);
            if (temp.right!=null)
                stack.push(temp.right);
        }

        return count;
    }
}