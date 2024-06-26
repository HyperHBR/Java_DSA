public class _02_Searching{
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

    public static boolean searchKey(Node root,int key){
        if(root==null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return searchKey(root.right, key);
        }
        else{
            return searchKey(root.right, key);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int Values[] = {5,1,3,4,2,7};

        for(int i=0;i<Values.length;i++){
            root = insert(root, Values[i]);
        }

        inOrder(root);

        System.out.println(searchKey(root, 6));
    }
}
