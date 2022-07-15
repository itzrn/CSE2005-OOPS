package DSAJAVA.Tree.BinaryTree;


import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

public class LevelOrderTreeBuilt<T> {
    static class Node<N>{
        N data;
        Node<N> left;
        Node<N> right;

        Node(N data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node<T> root;
    Queue<Node<T>> queue;

    LevelOrderTreeBuilt() {
        queue = new ArrayDeque<>();
    }

    int i=1;
    public void push(T data) {//This function is pushing data in level order
        Node<T> newNode = null;

        if (data!=null){
            newNode=new Node<>(data);
            queue.add(newNode);
        }

        if (root == null) {
            root = newNode;
            return;
        }
        if (!queue.isEmpty()) {
            if (i == 2) {
                queue.peek().right = newNode;
                queue.remove();
                i=1;
                return;
            }
            queue.peek().left = newNode;
            i=2;
        }else
            throw new EmptyStackException();
    }
}