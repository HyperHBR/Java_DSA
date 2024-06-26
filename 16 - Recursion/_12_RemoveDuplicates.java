public class _12_RemoveDuplicates {
    public static void RemoveDuplicates(String s,int index,StringBuilder sb, boolean Map[]){
        if(index==s.length()){
            System.out.println(sb);
            return;
        }
        if(Map[s.charAt(index)-'a']==false){
            sb.append(s.charAt(index));
            Map[s.charAt(index)-'a']=true;
        }
        RemoveDuplicates(s, index+1, sb, Map);
    }
    public static void main(String[] args) {
        String inputString = "hardiksinhrathod";
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];

        RemoveDuplicates(inputString,0,sb,map);
    }
}