public class _09_SubString {
    public static String subString(String s,int Start,int End){
        String str = "";
        for(int i=Start;i<End;i++){
            str += s.charAt(i);
        }

        return str;
    }   
    
    public static void main(String[] args) {
        String str = "HardiksinhRathod";

        //Way - 1
        System.out.println(subString(str, 0, 10));
        //Way - 2
        System.out.println(str.substring(10, 16));
    }
}
