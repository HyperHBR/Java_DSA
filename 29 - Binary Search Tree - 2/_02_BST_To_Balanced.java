import java.util.ArrayList;

public class _02_BST_To_Balanced {
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

    public static Node buildBalancedBST(ArrayList<Node> al,int St,int Ed){
        if(St > Ed){
            return null;
        }

        int Mid = (St+Ed) / 2;

        Node root = new Node(al.get(Mid).data);

        root.left = buildBalancedBST(al, St, Mid-1);
        root.right = buildBalancedBST(al, Mid+1, Ed);

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

    public static void calcInorder(Node root,ArrayList<Node> al){
        if(root==null){
            return;
        }

        calcInorder(root.left, al);
        al.add(root);
        calcInorder(root.right, al);
    }

    public static Node convertToBalanced(Node root){
        ArrayList<Node> al = new ArrayList<>();

        //Inorder Sequence
        calcInorder(root,al);

        //Creating A Balanced BST
        return buildBalancedBST(al, 0, al.size()-1);
    }

    public static void main(String[] args) {
    // Given BST
    /*
     *        8
     *       / \
     *      6  10
     *     /     \
     *    5      11
     *   /         \
     *  3          12 
     */

    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);

    preOrder(root);
    System.out.println();

    // Balanced BST
    /*
     *        8
     *      /   \
     *     5    11
     *    / \   / \
     *   3   6 10 112
     */
    
    
    root = convertToBalanced(root);
    
    preOrder(root);

    }
}
