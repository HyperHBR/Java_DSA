import java.util.*;

public class _02_All_Traversals{

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
        private static final String Queue = null;
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

        public static void preOrderTraversal(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.leftNode);
            preOrderTraversal(root.rightNode);
        }

        public static void postOrderTraversal(Node root){
            if(root == null){
                return;
            }

            postOrderTraversal(root.leftNode);
            postOrderTraversal(root.rightNode);
            System.out.print(root.data + " ");
        }

        public static void inOrderTraversal(Node root){
            if(root == null){
                return;
            }

            inOrderTraversal(root.leftNode);
            System.out.print(root.data + " ");
            inOrderTraversal(root.rightNode);
        }

        public static void levelOrderTraversal(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.leftNode!=null){
                        q.add(currNode.leftNode);
                    }
                    if(currNode.rightNode!=null){
                        q.add(currNode.rightNode);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(Nodes);
        
        bt.preOrderTraversal(root);
        System.out.println();
        bt.inOrderTraversal(root);
        System.out.println();
        bt.postOrderTraversal(root);
        System.out.println();
        bt.levelOrderTraversal(root);
        System.out.println();
    }
}