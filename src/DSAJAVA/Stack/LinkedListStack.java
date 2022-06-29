package DSAJAVA.Stack;

public class LinkedListStack<T> {//Last In First Out
    static class Node<N>{
        N data;
        Node<N> next;

        Node(N data){
            this.data=data;
            this.next=null;
        }
    }

    LinkedListStack(){
        this.length=0;
    }
    LinkedListStack(int length){
        this.length=length;
    }

    Node<T> head;
    int length;

    public int getLength() {
        return length;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void push(T data){//Big O(1)
        if (getLength()>0 && size()==getLength())
            throw new IndexOutOfBoundsException();

        Node<T> newNode=new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        //pushing the data
        newNode.next=head;
        head=newNode;
    }

    public T pop(){//Big O(1)
        if (isEmpty())
            throw new NoSuchFieldError();
        T top= head.data;

        //removing the last push
        head=head.next;

        return top;
    }

    public int size(){
        int length=0;
        Node<T> currentNode=head;

        while (currentNode!=null){
            length++;
            currentNode=currentNode.next;
        }

        return length;
    }

    public T peek(int position){//Big O(position)
        //top is the first position
        if ((getLength()>0 && position>getLength())||position>size())
            throw new IndexOutOfBoundsException();

        Node<T> currentNode=head;
        for (int i=1;i<position;i++){
            currentNode=currentNode.next;
        }
        return currentNode.data;
    }

    public void print(){
        if (isEmpty())
            throw new NoSuchFieldError();

        Node<T> currentNode=head;
        System.out.print("Top---> ");
        while (currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println("<---Bottom");
    }

    public T getTop(){
        if (isEmpty())
            throw new NoSuchFieldError();
        return head.data;
    }

    public T getBottom(){
        if (isEmpty())
            throw new NoSuchFieldError();

        Node<T> currentNode=head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }

        return currentNode.data;
    }
}
