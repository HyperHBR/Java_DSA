import java.util.Arrays;

public class _04_ClimbingStairs_Memoization {
    public static int climbingStairsRec(int n,int dp[]){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = climbingStairsRec(n-1, dp) + climbingStairsRec(n-2, dp);

        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climbingStairsRec(n,dp));
    }
}
