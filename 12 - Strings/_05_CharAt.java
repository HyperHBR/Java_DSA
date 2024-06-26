public class _05_CharAt {
    public static void PrintLetter(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "Hardiksinh";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        //System.out.println(str.charAt(-1)); //Invalid
        System.out.println();
        PrintLetter(str);
    }    
}
