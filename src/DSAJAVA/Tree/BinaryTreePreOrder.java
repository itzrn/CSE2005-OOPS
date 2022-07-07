package DSAJAVA.Tree;

public class BinaryTreePreOrder<T> {
    static class Node<N>{
        N data;
        Node<N> left;
        Node<N> right;

        Node(N data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    Node<T> root;
    Stack<Node<T>> stack;
    int i;
    int index;

    BinaryTreePreOrder(){
        stack=new Stack<>();
        i=0;
        index=-1;
    }

    public void push(T data){
        if (data==null) {
            i++;
            if (i==2){
                stack.remove();
                i=1;
                return;
            }
            return;
        }
        Node<T> newNode=new Node<>(data);
        if (root==null){
            root=newNode;
            stack.add(newNode);
            return;
        }
        if ((stack.peek().left!=null && stack.peek().right!=null) || (stack.peek().left==null && stack.peek().right!=null)){
            stack.remove();
        }
        if (i==1){
            stack.peek().right=newNode;
            stack.add(newNode);
            i=0;
            return;
        }
        stack.peek().left=newNode;
        stack.add(newNode);
    }

    public void print(Node<T> root){
        if (root==null)
            return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }

    public void print(){
        print(this.root);
    }

    public Node<T> pushRecursive(T[]node){//it's given array should end with at-least 2 null
        index++;
        if (node[index]==null)
            return null;

        Node<T> newNode=new Node<>(node[index]);
        newNode.left=pushRecursive(node);
        newNode.right=pushRecursive(node);

        return newNode;
    }
}