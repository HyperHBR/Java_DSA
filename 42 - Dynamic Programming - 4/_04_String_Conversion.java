public class _04_String_Conversion {
    public static int[] stringConversionOps(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        int dp [][] =new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(n==0 || m==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        //No Of Delete Operations
        int Del = n - dp[n][m];
        
        //No Of Insert Operations
        int Insert = m - dp[n][m];

        int Arr[] = {Insert,Del};

        return Arr;
    }
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";

        int Ops[] = new int[2];
        Ops = stringConversionOps(s1,s2);

        System.out.println(Ops[0]);
        System.out.println(Ops[1]);
    }
}
