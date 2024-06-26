public class _01_Create_Balance_BST{
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

    public static Node buildBalancedBST(int Arr[],int St,int Ed){
        if(St > Ed){
            return null;
        }

        int Mid = (St+Ed) / 2;

        Node root = new Node(Arr[Mid]);

        root.left = buildBalancedBST(Arr, St, Mid-1);
        root.right = buildBalancedBST(Arr, Mid+1, Ed);

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int Arr[] = {3,5,6,8,10,11,12};

        Node root = buildBalancedBST(Arr, 0, Arr.length-1);

        preOrder(root);
    }
}