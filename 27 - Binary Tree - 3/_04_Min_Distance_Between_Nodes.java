public class _04_Min_Distance_Between_Nodes {
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

    public static int getDistanceFromLCA(Node root,int n){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int leftDistance = getDistanceFromLCA(root.left, n);
        int rightDistance = getDistanceFromLCA(root.right, n);

        if(leftDistance==-1 && rightDistance==-1){
            return -1;
        }
        else if(leftDistance==-1){
            return rightDistance+1;
        }
        else{
            return leftDistance+1;
        }
    }

    public static int minDis(Node root,int n1,int n2){
        Node LCA = getLCA(root, n1, n2);

        int leftDis = getDistanceFromLCA(LCA,n1);
        int rightDis = getDistanceFromLCA(LCA,n2);

        return leftDis+rightDis;
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

        System.out.println(minDis(root, 2,3));
    }
}
