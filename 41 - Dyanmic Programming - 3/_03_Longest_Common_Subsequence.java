public class _03_Longest_Common_Subsequence {
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1) + 1;
        }
        else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);
            return Math.max(ans1,ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        System.out.println(lcs(str1,str2,str1.length(),str2.length()));
    }
}
