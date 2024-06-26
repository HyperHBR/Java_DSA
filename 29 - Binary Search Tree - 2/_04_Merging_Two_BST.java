import java.util.ArrayList;

public class _04_Merging_Two_BST {
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


    public static Node buildBalancedBST(ArrayList<Node> al,int St,int Ed){
        if(St > Ed){
            return null;
        }

        int Mid = (St+Ed) / 2;

        Node root = new Node(al.get(Mid).data);

        root.left = buildBalancedBST(al, St, Mid-1);
        root.right = buildBalancedBST(al, Mid+1, Ed);

        return root;
    }

    public static void inOrder(Node root,ArrayList<Node> al){
        if(root == null){
            return;
        }
        inOrder(root.left,al);
        al.add(root);
        inOrder(root.right,al);
    }

    public static void preOrderPrint(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    public static Node mergeBST(Node r1,Node r2){
        //Inorder AL
        ArrayList<Node> al1 = new ArrayList<>();
        ArrayList<Node> al2 = new ArrayList<>();

        inOrder(r1, al1);
        inOrder(r2, al2);

        int ptr1 = 0;
        int ptr2 = 0;

        //Combining Both ALs
        ArrayList<Node> al = new ArrayList<>();

        while(ptr1 < al1.size() && ptr2 < al2.size()){
            if(al1.get(ptr1).data<=al2.get(ptr2).data){
                al.add(al1.get(ptr1));
                ptr1++;
            }
            else{
                al.add(al2.get(ptr2));
                ptr2++;
            }
        }

        while(ptr1<al1.size()){
            al.add(al1.get(ptr1));
            ptr1++;
        }
        while(ptr2<al2.size()){
            al.add(al2.get(ptr2));
            ptr2++;
        }

        Node root = buildBalancedBST(al,0,al.size()-1);

        return root;
    }

    public static void main(String[] args) {
        // BST - 1
        /*
         *      2
         *     / \
         *    1   4
         */

        Node r1 = new Node(2);
        r1.left = new Node(1);
        r1.right = new Node(4);

        // BST - 2
        /*
         *      9
         *     / \
         *    3   12
         */

        Node r2 = new Node(9);
        r2.left = new Node(3);
        r2.right = new Node(12);

        Node root = mergeBST(r1,r2);

        preOrderPrint(root);
    }
}
