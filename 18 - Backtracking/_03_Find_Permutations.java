public class _03_Find_Permutations {
    public static void FindPermutations(String str,String Perm){
        if(str.length()==0){
            System.out.println(Perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            FindPermutations(NewStr, Perm+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        FindPermutations(str,"");
    }
}
