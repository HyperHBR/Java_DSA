public class _04_No_Of_Nodes {
    public static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = countNodes(root.leftNode);
        int rightNodes = countNodes(root.rightNode);

        return leftNodes+rightNodes+1;
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
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);

        System.out.println(countNodes(root));
    }
}
