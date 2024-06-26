import java.util.ArrayList;

public class _06_isValidBST {
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

    public static Node insert(Node root,int Val){
        if(root==null){
            root = new Node(Val);
            return root;
        }

        if(Val<root.data){
            root.left = insert(root.left, Val);
        }
        else{
            root.right = insert(root.right, Val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static boolean isValidBST(Node root,Node Min,Node Max){
        if(root==null){
            //Empty Tree Is Valid BST
            return true;
        }

        if(Min!=null  && Min.data >= root.data){
            return false;
        }
        else if(Max!=null  && Max.data <= root.data){
            return false;
        }

        return isValidBST(root.left,Min,root) && isValidBST(root.right,root,Max);
    }

    public static void main(String[] args) {
        Node root = null;
        int Values[] = {8,5,3,1,4,6,10,11,14};

        for(int i=0;i<Values.length;i++){
            root = insert(root, Values[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println(isValidBST(root, null, null));
    }
}
