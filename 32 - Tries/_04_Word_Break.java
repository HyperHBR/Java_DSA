import java.util.List;

public class _04_Word_Break{
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

    public static boolean search(String word){
        Node curr = root;

        for(int level = 0;level<word.length();level++){
            int index = word.charAt(level) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }

        return curr.endOfWord == true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","mobile","ice"};
        String key = "samsung";    

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }
}

/*
 * wordBreak("sung"):

    Check prefix "s". Not in Trie.
    Check prefix "su". Not in Trie.
    Check prefix "sun". Not in Trie.
    Check prefix "sung". Not in Trie.
    No valid segmentation found. Return false.
    Since wordBreak("sung") returns false, the previous call wordBreak("samsung") also continues to check:

    wordBreak("samsung") (continued):

    Check prefix "sams". Not in Trie.
    Check prefix "samsu". Not in Trie.
    Check prefix "samsun". Not in Trie.
    Check prefix "samsung". Found in Trie.
 */