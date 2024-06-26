import java.util.*;

public class _04_Top_View {
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
        Node node;
        int hD;

        public InfoNode(Node node,int hD){
            this.node = node;
            this.hD = hD;
        }
    }

    public static void TopView(Node root){
        //Min Max Tracker
        int Min = 0;
        int Max = 0;

        //Horizontal Distance Map
        HashMap<Integer,Node> map = new HashMap<>();

        //Level Order Traversal
        Queue<InfoNode> q = new LinkedList<>();

        q.add(new InfoNode(root, 0));
        q.add(null);

        //Solution
        while(!q.isEmpty()){
            InfoNode currNode = q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(currNode.hD)){
                    //First Time Occuring
                    map.put(currNode.hD,currNode.node);
                }
                if(currNode.node.left != null){
                    q.add(new InfoNode(currNode.node.left, currNode.hD-1));
                    Min = Math.min(Min,currNode.hD-1);
                }
                if(currNode.node.right != null){
                    q.add(new InfoNode(currNode.node.right, currNode.hD+1));
                    Max = Math.max(Max,currNode.hD+1);
                }
            }
        }

        //Printing
        for(int i=Min;i<=Max;i++){
            System.out.print(map.get(i).data + " ");
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

        TopView(root);
    }
}
