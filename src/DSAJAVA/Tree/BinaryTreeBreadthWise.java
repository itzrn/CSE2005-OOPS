package DSAJAVA.Tree;

class BinaryTreeBreadthWise<T> {
    private static class NodeTree<NT>{
        NT data;
        NodeTree<NT> right;
        NodeTree<NT> left;

        NodeTree(NT data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    NodeTree<T> root;
    Queue<NodeTree<T>> queue;

    BinaryTreeBreadthWise(){
        queue=new Queue<>();
    }

    public void push(T data){//generating tree - breadth wise, here it can crete a node with null data
        NodeTree<T> newNodeTree=new NodeTree<>(data);
        queue.enQueue(newNodeTree);

        if (root==null){
            root=newNodeTree;
            return;
        }

        if (queue.peekFront().left==null){
            queue.peekFront().left=newNodeTree;
            return;
        }

        queue.peekFront().right=newNodeTree;
        queue.deQueue();
    }

    public void print(){
        if (root==null)
            return;

        Queue<NodeTree<T>> queue1=new Queue<>();
        queue1.enQueue(root);

        while (!queue1.isQueueEmpty()){
            NodeTree<T> temp=queue1.peekFront();
            if (temp.data!=null) {
                System.out.println(temp.data);
            }
            queue1.deQueue();

            if (temp.left!=null){
                queue1.enQueue(temp.left);
            }
            if (temp.right!=null){
                queue1.enQueue(temp.right);
            }
        }
    }

//    public void print(NodeTree<T> root){//this will print in PreOrder sequence
//        if (root==null || root.data==null)//while traversing node with null data will get ignored, the process will work on node having data
//            return;
//        System.out.print(root.data+" ");
//        print(root.left);
//        print(root.right);
//    }
//
//    public void print(){
//        print(this.root);
//    }
}