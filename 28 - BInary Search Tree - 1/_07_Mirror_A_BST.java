public class _07_Mirror_A_BST {
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

    public static Node mirroringBST(Node root){
        if(root == null){
            return null;
        }
        Node LeftMirror = mirroringBST(root.left);
        Node RightMirror = mirroringBST(root.right);

        root.left = RightMirror;
        root.right = LeftMirror;

        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int Values[] = {8,5,3,1,4,6,10,11,14};

        for(int i=0;i<Values.length;i++){
            root = insert(root, Values[i]);
        }

        inOrder(root);
        System.out.println();
        
        root = mirroringBST(root);

        inOrder(root);
        System.out.println();
    }
}
