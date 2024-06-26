public class _05_Unbounded_Knapsack {
    public static int knapsack_unbounded(int val[],int wt[],int bagCapacity){
        int n = val.length;
        int dp[][] = new int[n+1][bagCapacity+1];

        //Initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }

        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }

        // Filling
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int v = val[i-1];
                int w = wt[i-1];
                //Valid
                if(w<=j){
                    dp[i][j] = Math.max(v+dp[i][j-w], dp[i-1][j]);
                }
                //Invalid
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[n][bagCapacity];
    }


    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int bagCapacity = 7;

        System.out.println(knapsack_unbounded(val,wt,bagCapacity));
    }
}
