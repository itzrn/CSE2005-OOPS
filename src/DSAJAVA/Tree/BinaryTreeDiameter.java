package DSAJAVA.Tree;

public class BinaryTreeDiameter<T> extends BinaryTreeHeight<T>{

    public int diameter(Node<T> root){//Big O(N^2) ---> this function can be optimized to liner time function
        if (root==null)
            return 0;
        int diaLeft=diameter(root.left);
        int diaRight=diameter(root.right);
        int diaRoot=heightOfTree(root.left)+heightOfTree(root.right)+1;


        //one line return --->
        //return Math.max(Math.max(diameter(root.left),diameter(root.right)),heightOfTree(root.left)+heightOfTree(root.right)+1);

        return Math.max(Math.max(diaLeft,diaRight),diaRoot);
    }

    public int height(){
        return heightOfTree(root);
    }



    static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }

    public TreeInfo diameterOptimized(Node<T> root) {//Big O(n)
        if (root==null)
            return new TreeInfo(0,0);

        TreeInfo left=diameterOptimized(root.left);
        TreeInfo right=diameterOptimized(root.right);

        int myHeight=Math.max(left.height, right.height)+1;

        int diaLeft= left.diameter;
        int diaRight= right.diameter;
        int diaRoot=left.height+right.height+1;//diameter through root

        int myDiameter=Math.max(Math.max(diaLeft,diaRight),diaRoot);

        return new TreeInfo(myHeight,myDiameter);
    }

    public int diameterOptimized(){
        return diameterOptimized(root).diameter;
    }
}