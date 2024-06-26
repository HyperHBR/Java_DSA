import java.util.*;

public class _02_Lowest_Common_Ancestor {
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
        //Creating ArrayList
        ArrayList<Node> Path1 = new ArrayList<>();
        ArrayList<Node> Path2 = new ArrayList<>();

        //Getting Paths
        getPath(root,n1,Path1);
        getPath(root,n2,Path2);

        int i=0;

        for(;i<Path1.size() && i<Path2.size();i++){
            if(Path1.get(i).data != Path2.get(i).data){
                break;
            }
        }

        return Path1.get(i-1);
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

        System.out.println(getLCA(root, 4, 5).data);
    }
}
