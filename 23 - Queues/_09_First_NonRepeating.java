import java.util.*;

public class _09_First_NonRepeating {
    public static void FirstNonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int Map[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            q.add(ch);
            Map[ch-'a']++;
            
            while(!q.isEmpty() && Map[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(" -1");
            }
            else{
                System.out.print(" " + q.peek());
            }
        }
    }


    public static void main(String[] args) {
        String str = "aabccxb";
        FirstNonRepeating(str);
        System.out.println();
    }
}
