import java.util.*;

public class _03_LCA_SC_Constant {
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

    public static boolean getPath(Node root,int n,ArrayList<Node> AL){
        if(root == null){
            return false;
        }

        AL.add(root);

        if(root.data == n){
            return true;
        }

        boolean leftFound = getPath(root.left, n, AL);
        boolean rightFound = getPath(root.right, n, AL);

        if(leftFound||rightFound){
            return true;
        }

        //Removing Last One Since In The ST We Are Not Able To Find The n
        AL.remove(AL.size()-1);
        return false;
    }

    public static Node getLCA(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = getLCA(root.left, n1, n2);
        Node rightLCA = getLCA(root.right, n1, n2);

        if(leftLCA==null){
            return rightLCA;
        }
        if(rightLCA==null){
            return leftLCA;
        }

        //Else
        return root;
    }
    public static void main(String[] args) {
        /*
         *      1
         *     / \
         *    2   3
         *   / \ / \
         *  4  5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(getLCA(root, 7, 5).data);
    }
}
