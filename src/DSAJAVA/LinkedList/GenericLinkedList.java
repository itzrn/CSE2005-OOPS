package DSAJAVA.LinkedList;

import java.util.NoSuchElementException;

public class GenericLinkedList<T> {
    /**
     * All Function
     * addFirst(T data), add(T data), size(), get(int Index),getIndexOf(T data), removeFirst(), removeLast(),
     * add(int index,T data), remove(), remove(int index), print(), deleteRepeatedElement(), deleteRepeatedElementUsingMethod()
     * selectionSor(), selectionSortOfStringOnBasisOfLength(GenericLinkedList<string> genericLinkedList),
     * getNodeOfIndex(int index), bubbleSort(), linearSearch(T data),
     * binarySearchOfNumber(number data,GenericLinkedList<number> genericLinkedList,int min, int max)
     */
    static class Node<N>{
        N data;
        Node<N> next;

        Node(N data){
            this.data=data;
            this.next=null;
        }
    }

    Node<T> head;

    public void addFirst(T data){
        Node<T> newNode=new Node<>(data);

        if (head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void add(T data){
        Node<T> newNode= new Node<>(data);

        if (head==null){
            head=newNode;
            return;
        }
        Node<T> currentNode=head;

        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    public int size(){
        int length=0;

        Node<T> currentNode=head;
        while (currentNode!=null){
            currentNode=currentNode.next;
            length++;
        }
        return length;
    }

    public T get(int Index){
        if (head==null || Index>=size())
            throw new IndexOutOfBoundsException();
        Node<T> currentNode=head;

        for (int i=0;i<Index;i++){
            currentNode=currentNode.next;
        }
        return currentNode.data;
    }

    public int getIndexOf(T data){
        int index=0;

        if (head==null)
            return -1;
        Node<T> currentNode=head;

        while (currentNode!=null){
            if (currentNode.data==data){
                break;
            }
            currentNode=currentNode.next;
            index++;
        }
        if (index==size())
            throw new NoSuchElementException();
        return index;
    }

    public T removeFirst(){
        Node<T> firstElement=head;
        head=head.next;
        return firstElement.data;
    }

    public void removeLast(){
        Node<T> currentNode=head;

        for (int i=0;i<size()-2;i++){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }

    public void add(int index, T data){
        Node<T> newNode=new Node<>(data);
        Node<T> currentNode=head;
        Node<T> nextNode;
        if (index==0){
            addFirst(data);
            return;
        }
        for (int i=0;i<index-1;i++){
            currentNode=currentNode.next;
        }
        nextNode=currentNode.next;
        currentNode.next=newNode;
        newNode.next=nextNode;
    }

    public void remove(){
        removeLast();
    }

    public T remove(int index){
        Node<T> currentNode=head;
        Node<T> deletedNode;
        if (index==0){
            return removeFirst();
        }

        for (int i=0;i<index-1;i++){
            currentNode=currentNode.next;
        }
        deletedNode=currentNode.next;
        currentNode.next=currentNode.next.next;
        return deletedNode.data;
    }

    public void print(){
        Node<T> currentNode=head;
        System.out.print("GenericLinkedList ---> [");
        for (int i=0;i<size()-1;i++){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data);
        System.out.println("]");
    }

    public void deleteRepeatedElement(){//CTCI Question
        Node<T> currentNode=head;
        Node<T> nextNode;

        while (currentNode!=null){
            nextNode=currentNode;
            while (nextNode.next!=null){
                if (currentNode.data== nextNode.next.data)
                    nextNode.next=nextNode.next.next;
                else
                    nextNode=nextNode.next;
            }
            currentNode=currentNode.next;
        }
    }

    public void deleteRepeatedElementUsingMethod(){
        int n=size();

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (get(i)==get(j)) {
                    remove(j);
                    n=size();
                }
            }
        }
    }

    public <number extends Number> void selectionSort(GenericLinkedList<number> genericLinkedList){
        Node<number>currentNode=genericLinkedList.head;
        Node<number>nextNode;
        number temp;

        while (currentNode!=null){
            nextNode=currentNode;
            while (nextNode.next!=null){
                if (currentNode.data.doubleValue()>nextNode.next.data.doubleValue()){
                    temp= currentNode.data;
                    currentNode.data=nextNode.next.data;
                    nextNode.next.data=temp;
                }
                nextNode=nextNode.next;
            }
            currentNode=currentNode.next;
        }
    }

    public <string extends String> void selectionSortOfStringOnBasisOfLength(GenericLinkedList<string> genericLinkedList){
        Node<string> currentNode=genericLinkedList.head;
        Node<string> nextNode;
        string temp;

        while (currentNode!=null){
            nextNode=currentNode.next;
            while (nextNode!=null){
                if (currentNode.data.length()>nextNode.data.length()){
                    temp= currentNode.data;
                    currentNode.data=nextNode.data;
                    nextNode.data=temp;
                }
                nextNode=nextNode.next;
            }
            currentNode=currentNode.next;
        }
    }

    public Node<T> getNodeOfIndex(int index){
        Node<T> currentNode=head;
        for (int i=0;i<index;i++){
            currentNode=currentNode.next;
        }
        return currentNode;
    }


    public <number extends Number> void  bubbleSort(GenericLinkedList<number> genericLinkedList){
        number temp;
        int a=1;
        for (int i=0;i<genericLinkedList.size();i++){
            for (int j=0;j<genericLinkedList.size()-a;j++){
                temp=genericLinkedList.getNodeOfIndex(j).data;
                if (genericLinkedList.getNodeOfIndex(j).data.doubleValue()>genericLinkedList.getNodeOfIndex(j+1).data.doubleValue()){
                    genericLinkedList.getNodeOfIndex(j).data=genericLinkedList.getNodeOfIndex(j+1).data;
                    genericLinkedList.getNodeOfIndex(j+1).data=temp;
                }
            }
            a++;
        }
    }

    public boolean linearSearch(T data){
        for (int i=0;i<size();i++){
            if (data.equals(getNodeOfIndex(i).data)) {
                return true;
            }
        }
        return false;
    }

    public <number extends Number> int binarySearchOfNumber(number data,GenericLinkedList<number> genericLinkedList,int min, int max){
        int mid=(min+max)/2;
        if (min>mid)
            return -1;
        else if (genericLinkedList.getNodeOfIndex(mid).data.doubleValue()== data.doubleValue())
            return mid;
        else if (genericLinkedList.getNodeOfIndex(mid).data.doubleValue()> data.doubleValue())
            return binarySearchOfNumber(data, genericLinkedList,min,mid-1);
        else if (genericLinkedList.getNodeOfIndex(mid).data.doubleValue()< data.doubleValue())
            return binarySearchOfNumber(data,genericLinkedList,mid+1,max);
        else
            return -1;
    }
}