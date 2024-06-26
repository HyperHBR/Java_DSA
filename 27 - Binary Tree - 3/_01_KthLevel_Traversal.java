import java.util.*;

public class _01_KthLevel_Traversal{
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

    public static void KLevel(Node node,int currLevel,int levelToPrint){
        if(node == null){
            return;
        }

        if(currLevel==levelToPrint){
            System.out.print(node.data + " ");
        }

        KLevel(node.left, currLevel+1, levelToPrint);
        KLevel(node.right, currLevel+1, levelToPrint);
    }

    public static void KLevelIterative(Node root,int levelToPrint){
        if(root==null){
            return;
        }

        int currLevel = 1;
        //int intoTheLoop = 0; //To Check currLevel<=levelToPrint Is Working How Efficiently

        Queue<Node> q =new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty() && currLevel<=levelToPrint){
            //intoTheLoop++;
            Node currNode = q.remove();

            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    currLevel += 1;
                }
            }
            else{
                if(currLevel == levelToPrint){
                    System.out.print(currNode.data + " ");
                }
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
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

        KLevelIterative(root,2);
    }
}