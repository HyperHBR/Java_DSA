public class _03_SubTree_Or_Not {
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

    public static boolean isIdentical(Node Root1,Node Root2){
        if(Root1==null && Root2==null){
            return true;
        }
        else if(Root1==null || Root2==null || Root1.data != Root2.data){
            return false;
        }

        if(!isIdentical(Root1.left, Root2.left)){
            return false;
        }
        if(!isIdentical(Root1.right, Root2.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root,Node subRoot){
        if(root ==null){
            //Because Subroot Is Non Empty
            return false;
        }
        //Finding The subRoot In Main Tree
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        
        // boolean leftAns = isSubTree(root.left, subRoot);
        // boolean rightAns = isSubTree(root.right, subRoot);

        //It Is Better To Write Return Directly Because if We Found A Tree 
        //In Left We Wont Be Executing isSubTree For Right --> Saving Memory

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        //Main

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

        //SubTree To Be Checked

         /*
         *      1
         *     / \
         *    2   3
         *   / \ / \
         *  4  5 6  7
         */


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root,subRoot));
    }
}
