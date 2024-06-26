public class _01_PreOrder_Build{

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

    public static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int Nodes[]){
            idx++;

            if(Nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.leftNode = buildTree(Nodes);
            newNode.rightNode = buildTree(Nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(Nodes);
        System.out.println(root.leftNode.rightNode.data);
    }
}