public class _01_WildCard_Pattern{
    public static boolean wildCardPatternMatch(String s,String p){
        int n=s.length();
        int m=p.length();
        boolean dp[][] = new boolean[n+1][m+1];

        //Initialization
        dp[0][0] = true;

        //If Pattern Is Empty
        for(int i=1;i<n+1;i++){
            dp[i][0] = false;
        }
        
        //If String Is Empty
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];
            }
            else{ //We Can Skip Else For Java
                dp[j][0] = false;
            }
        }

        //Filling
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    //Either Include Or Exclude
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "ba*a";

        System.out.println(wildCardPatternMatch(s,p));
    }
}