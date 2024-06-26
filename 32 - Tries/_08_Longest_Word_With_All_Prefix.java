public class _08_Longest_Word_With_All_Prefix {
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

    public static String finalAns = "";

    public static void longestWordWithAllPrefix(Node root,StringBuilder temp){
        //Now Finding Node With AllNode As 
        if(root == null){
            return;
        }

        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].endOfWord == true){
                temp = temp.append((char)(i+'a'));
                if(temp.length() > finalAns.length()){
                    finalAns = temp.toString();
                }
                longestWordWithAllPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a","banana","app","apple","appl","apply","ap"};

        //Creating Trie
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        longestWordWithAllPrefix(root,new StringBuilder(""));

        System.out.println(finalAns);
    }
}
