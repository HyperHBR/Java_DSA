import java.util.ArrayList;

public class _03_Size_Of_Largest_BST {

    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int maxSize = 0;
    
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        
        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Info sizeOfLargestBST(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Info leftInfo = sizeOfLargestBST(root.left);
        Info rightInfo = sizeOfLargestBST(root.right);

        //Now Calc Values 
        int Size = leftInfo.size + rightInfo.size + 1;
        int Min = Math.min(Math.min(leftInfo.min,rightInfo.min),root.data);
        int Max = Math.max(Math.max(leftInfo.max,rightInfo.max),root.data);

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, Size, Min, Max);
        }
        
        if(leftInfo.isBST && rightInfo.isBST){
            maxSize = Math.max(maxSize, Size);
            return new Info(true, Size, Min, Max);
        }
        return new Info(false, Size, Min, Max);
    }

    public static void main(String[] args) {
    // Given BST
    /*
     *         50
     *       /    \
     *      30     60
     *     /  \   /  \
     *    5   20 45  70
     *              /   \  
     *             65   80
     */ 

    Node root = new Node(50);
    root.left = new Node(30);
    root.right = new Node(60);

    root.left.left = new Node(5);
    root.left.right = new Node(20);

    root.right.left = new Node(45);
    root.right.right = new Node(70);

    root.right.right.left = new Node(65);
    root.right.right.right = new Node(80);

    Info info = sizeOfLargestBST(root);

    System.out.println(maxSize);
    }
}
