import java.util.Arrays;

public class _03_Catalan_Number_Memoization {
    public static int catalanMem(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        
        int ans = 0; //Cn
        
        for(int i=0;i<n;i++){
            ans += catalanMem(i,dp) * catalanMem(n-i-1,dp);
        }

        dp[n] = ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(catalanMem(n,dp));
    }
}
