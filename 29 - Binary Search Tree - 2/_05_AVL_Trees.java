public class _05_AVL_Trees {

    public static class Node{
        int data,height;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    public static Node root;

    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        
        return root.height;
    }

    public static int getBalance(Node root){
        if(root==null){
            return 0;
        }

        return Height(root.left) - Height(root.right);
    }

    public static Node rotateLeft(Node X){
        //Selecting Node
        /*
         *      A                      X
         *       \                      \
         *        B                      Y
         *         \                    /
         *          C                  T2
         */
        
        //After Left Rotation
        /*
         *      Y
         *     /
         *    X
         *     \
         *      T2 
         */
        
        Node y = X.right;
        Node T2 = y.left;

        //Perform Rotation
        y.left = X;
        X.right = T2;

        //Updating Height
        y.height = Math.max(Height(y.left),Height(y.right))+1;
        X.height = Math.max(Height(X.left),Height(X.right))+1;

        //Y Is New Root
        return y;
    }

    public static Node rotateRight(Node X){
        //Selecting Node
        /*
         *      A           X
         *     /           /          
         *    B           Y           
         *   /             \
         *  C              T2
         */
        
        //After Right Rotation
        /*
         *      Y
         *       \
         *        X
         *       /
         *      T2 
         */
        
        Node y = X.left;
        Node T2 = y.right;

        //Perform Rotation
        y.right = X;
        X.left = T2;

        //Updating Height
        y.height = Math.max(Height(y.left),Height(y.right))+1;
        X.height = Math.max(Height(X.left),Height(X.right))+1;

        //Y Is New Root
        return y;
    }

    public static Node insert(Node root,int value){
        if(root == null){
            //Initially Empty
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else if(value > root.data){
            root.right = insert(root.right, value);
        }
        else{
            return root; //This Case Implies Duplicate Value Which We Are Not Allowing
        }

        //Updating Height
        root.height = Math.max(Height(root.left),Height(root.right))+1;

        //Getting The Balance Factor
        int BF = getBalance(root);

        //Case - 1 - LL
        if(BF > 1 && value<root.left.data){
            return rotateRight(root);
        }

        //Case - 2 - LR
        if(BF > 1 && value>root.left.data){
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }

        //Case - 3 - RR
        if(BF < -1 && value>root.right.data){
            return rotateLeft(root);
        }

        //Case - 4 - RL
        if(BF < -1 && value<root.right.data){
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
    }
}

/*
 *             13
 *           /    \
 *          12    19
 *         /     /   \
 *        4     17   53
 *             /    /  \
 *            16   20  60
 */
