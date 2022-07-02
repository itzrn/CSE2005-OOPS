package DSAJAVA.Stack.CTCI;

import java.util.EmptyStackException;

/**
 * 3.1, page-67
 * Design a stack which, in addition to push(Big O(1)) and pop(Big O(1)),
 * has a function min which return the minimum element
 */
public class StackMin<T extends Number> {
    static class Node<N>{
        N data;
        Node<N> next;

        Node(N data){
            this.data=data;
            this.next=null;
        }
    }

    Node<T> head;
    Node<T> headMin;
    T min;

    public void push(T data){
        Node<T> newNode=new Node<>(data);
        Node<T> node;
        if (head==null){
            head=newNode;
            min= head.data;
            node=new Node<>(min);
            headMin=node;
            return;
        }

        newNode.next=head;
        head=newNode;
        if (head.data.doubleValue() < min.doubleValue()) {
            min = head.data;
            node=new Node<>(min);
            node.next=headMin;
            headMin=node;

        }
    }

    public T pop(){
        if (head==null)
            throw new EmptyStackException();

        T t= head.data;
        if (t.doubleValue()==headMin.data.doubleValue()){
            headMin=headMin.next;
            if (headMin==null)
                throw new EmptyStackException();
            min= headMin.data;
        }
        head=head.next;
        return t;
    }

    public T getMin(){
        return min;
    }

    public void print(){
        if (head==null)
            throw new EmptyStackException();

        Node<T> currentNode=head;
        System.out.print("Top-->");
        while (currentNode.next!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println(currentNode.data+"<--Bottom");
    }
}