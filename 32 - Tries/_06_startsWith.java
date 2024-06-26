public class _06_startsWith {
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
    public static void main(String[] args) {
        String words[] = {"apple","app","mango","man","woman"};

        for(String word:words){
            insert(word);
        }

        System.out.println(startsWith("app"));
    }
}
