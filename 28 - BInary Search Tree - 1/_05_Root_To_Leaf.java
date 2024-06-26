import java.util.ArrayList;

public class _05_Root_To_Leaf {
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

    public static void printPath(ArrayList<Integer> AL){
        for(int i=0;i<AL.size();i++){
            System.out.print(AL.get(i) + "-->");
        }
        System.out.println("NULL");
    }

    public static void RootToLeaf(Node root,ArrayList<Integer> AL){
        if(root==null){
            return;
        }

        AL.add(root.data);

        if(root.left == null && root.right==null){
            printPath(AL);
        }     
        
        RootToLeaf(root.left, AL);
        RootToLeaf(root.right, AL);

        AL.remove(AL.size()-1);
    }

    public static void main(String[] args) {
        Node root = null;
        int Values[] = {8,5,3,1,4,6,10,11,14};

        for(int i=0;i<Values.length;i++){
            root = insert(root, Values[i]);
        }

        inOrder(root);
        System.out.println();
        RootToLeaf(root, new ArrayList<Integer>());
    }
}
