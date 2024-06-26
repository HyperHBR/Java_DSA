public class _07_Count_Unique_Sub_Strings {
    public static class Node{
        Node[] children = new Node[26];
        boolean endOfWord = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int index = word.charAt(level) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }

        curr.endOfWord = true;
    }

    public static boolean startsWith(String s){
        Node curr = root;

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(curr.children[index]!=null){
                curr = curr.children[index];
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;

        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count+=countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static void countUniqueSubStrings(String str){
        //Finding All Suffix
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
    public static void main(String[] args) {
        String str = "ababa";
        countUniqueSubStrings(str);
    }
}
