import java.util.Arrays;

public class _05_Min_Array_Jumps{
    public static int minArrayJumps(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];

        //Initially Assuming Not Possible To Reach
        Arrays.fill(dp, -1);

        //Base Case
        dp[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            int stepsAllowed = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1;j<=i+stepsAllowed && j<n;j++){
                if(dp[j] != -1){//Means Possible From here
                    ans = Math.min(ans,dp[j]+1);
                }
            }

            if(ans!=Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }

        return dp[0];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(minArrayJumps(arr));
    }
}