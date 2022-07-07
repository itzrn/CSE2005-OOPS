package DSAJAVA.Tree;

public class BinaryTreePostOrder<T> {
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
    int i;
    Stack<Node<T>> stack;
    BinaryTreePostOrder(){
        i=0;
        stack=new Stack<>();
    }

    public void push(T data){//not exactly post order
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
        if ((stack.peek().left!=null && stack.peek().right!=null) || (stack.peek().right==null && stack.peek().left!=null)){
            stack.remove();
        }
        if (i==1){
            stack.peek().left=newNode;
            stack.add(newNode);
            i=0;
            return;
        }
        stack.peek().right=newNode;
        stack.add(newNode);
    }

    public void print(Node<T> root){//this will print exactly in post order
        if(root==null)
            return;

        print(root.left);
        print(root.left);
        System.out.print(root.data+" ");
    }
}
