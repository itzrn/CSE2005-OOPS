package DSAJAVA.Tree.BinaryTree;

/**
 *Algorithm
 * Start from the end of postOrder & pick an element to create a node
 * Decrement postOrder index
 * Search for picked element's position in inOrder
 * Call to Build  right subtree from inOrder's Position+1 to n
 * call to Build left subtree from inorder 0 to position-1
 * return the node
 */
public class TreeBuildUsingPostorderAndInorder<T> {
    static class Node<N>{
        N data;
        Node<N> right;
        Node<N> left;

        Node(N data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    int index;

    TreeBuildUsingPostorderAndInorder(int index){
        this.index=index;
    }

    private int searchPosition(T[] inOrder,T currentData,int start,int end){
        for (int i=start;i<=end;i++){
            if (inOrder[i]==currentData)
                return i;
        }
        return -1;
    }

    public Node<T> buildTree(T[] postOrder,T[] inOrder, int start,int end){
        if (start>end)
            return null;
        T currentData=postOrder[index];
        index--;
        Node<T> newNode=new Node<>(currentData);
        if (start==end)
            return newNode;
        int position=searchPosition(inOrder,currentData,start,end);
        newNode.right=buildTree(postOrder,inOrder,position+1,end);
        newNode.left=buildTree(postOrder,inOrder,start,position-1);

        return newNode;
    }
}
