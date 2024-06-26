import java.util.HashMap;

public class _07_isAnagram {
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "haardik";
        String s2 = "dikahar";

        System.out.println(isAnagram(s1,s2));
    }
}
