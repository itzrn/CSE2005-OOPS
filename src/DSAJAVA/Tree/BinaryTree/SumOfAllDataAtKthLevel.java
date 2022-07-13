package DSAJAVA.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfAllDataAtKthLevel extends LevelOrder<Integer> {

    /**
    public int sum(int level){// My First Approach
        if (root==null)
            return 0;

        if (level==1)
            return root.data;

        Queue<Node<Integer>> queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);

        int sum=0;
        Node<Integer> temp;
        int i=1;
        while (i!=level) {
            temp = queue.remove();
            if (temp != null) {
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            } else {
                i++;
                queue.add(null);
            }
        }
        temp=queue.remove();

        while (temp!=null){
            sum=sum+ temp.data;
            temp=queue.remove();
        }

        return sum;
    }
     */

    public void summation(int level){
        if (level==1) {
            System.out.println(root.data);
            return;
        }

        int sum=0;
        Queue<Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        Node<Integer> temp;
        while (true){
            temp=queue.remove();
            if (temp==null){
                level=level-1;
                queue.add(null);
            }else {
                if (level==2){
                    while (temp!=null){
                        if (temp.left!=null)
                            sum=sum+temp.left.data;
                        if (temp.right!=null)
                            sum=sum+temp.right.data;
                        temp=queue.remove();
                    }
                    System.out.println(sum);
                    return;
                }
                if (temp.left!=null)
                    queue.add(temp.left);
                if (temp.right!=null)
                    queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        SumOfAllDataAtKthLevel sumOfAllDataAtKthLevel=new SumOfAllDataAtKthLevel();
        sumOfAllDataAtKthLevel.push(1);
        sumOfAllDataAtKthLevel.push(2);
        sumOfAllDataAtKthLevel.push(3);
        sumOfAllDataAtKthLevel.push(4);
        sumOfAllDataAtKthLevel.push(null);
        sumOfAllDataAtKthLevel.push(5);
        sumOfAllDataAtKthLevel.push(7);
        sumOfAllDataAtKthLevel.push(null);
        sumOfAllDataAtKthLevel.push(null);
        sumOfAllDataAtKthLevel.push(11);
        sumOfAllDataAtKthLevel.push(12);
        sumOfAllDataAtKthLevel.summation(5);
    }
}