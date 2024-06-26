public class _06_Palindrome {
    public static boolean CheckPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(CheckPalindrome(str));
    }    
}
