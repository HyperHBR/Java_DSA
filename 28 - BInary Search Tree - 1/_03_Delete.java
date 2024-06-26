public class _03_Delete{
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

    public static Node deleteKey(Node root,int key){
        if(root==null){
            return root;
        }
        
        //Searching First
        if(root.data < key){
            root.right = deleteKey(root.right, key);
        }
        else if(root.data > key){
            root.left = deleteKey(root.left, key);
        }
        else{
            //Case - 1 Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //Case - 2 : One Child
            if(root.left == null){
                return root.right;
            }
            else if(root.left == null){
                return root.left;
            }

            //Case - 3 : Two Children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteKey(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int Values[] = {8,5,3,1,4,6,10,11,14};

        for(int i=0;i<Values.length;i++){
            root = insert(root, Values[i]);
        }

        inOrder(root);
        root = deleteKey(root, 4);
        System.out.println();
        inOrder(root);
    }
}
