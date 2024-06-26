public class _01_Diameter_1{
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

    public static int calcHeight(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int calcDiam(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = calcDiam(root.left);
        int rightDiam = calcDiam(root.right);
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);
        int selfDiam = leftHeight+rightHeight+1;

        int LHMax = Math.max(leftDiam,rightDiam);
        return Math.max(LHMax,selfDiam);
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

        System.out.println(calcDiam(root));
    }
}