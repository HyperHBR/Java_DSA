public class _02_Diameter_2{
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

    public static class InfoNode{
        int Height;
        int Diam;

        public InfoNode(int Height,int Diam){
            this.Height = Height;
            this.Diam = Diam;
        }
    }

    public static InfoNode calcDiam(Node root){
        if(root == null){
            return new InfoNode(0,0);
        }

        InfoNode leftInfo = calcDiam(root.left);
        InfoNode rightInfo = calcDiam(root.right);

        int selfDiam = Math.max(Math.max(leftInfo.Diam,rightInfo.Diam),leftInfo.Height + rightInfo.Height + 1);
        int selfHeight = Math.max(leftInfo.Height,rightInfo.Height) + 1;

        return new InfoNode(selfHeight,selfDiam);
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

        System.out.println(calcDiam(root).Diam);
    }
}