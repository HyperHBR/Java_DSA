public class _13_Compression {
    public static String StringCompress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer Count = 1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                Count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(Count>1){
                sb.append(Count.toString());
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabcdaae";

        System.out.println(StringCompress(str));
    }    
}
