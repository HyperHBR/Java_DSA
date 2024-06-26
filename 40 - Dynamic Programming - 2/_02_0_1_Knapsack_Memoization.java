import java.util.Arrays;

public class _02_0_1_Knapsack_Memoization{

    public static int knapsack_0_1(int val[],int wt[],int bagCapacity,int idx,int dp[][]){
        if(bagCapacity == 0 || idx == val.length){
            return 0;
        }

        if(dp[idx][bagCapacity] != -1){
            return dp[idx][bagCapacity];
        }

        //Valid
        if(wt[idx] <= bagCapacity){
            int Included = knapsack_0_1(val, wt, bagCapacity-wt[idx], idx+1,dp) + val[idx];

            int Excluded = knapsack_0_1(val, wt, bagCapacity, idx+1,dp);

            dp[idx][bagCapacity] =  Math.max(Included, Excluded);
            return dp[idx][bagCapacity];
        }
        else{
            dp[idx][bagCapacity] = knapsack_0_1(val, wt, bagCapacity, idx+1,dp);
            return dp[idx][bagCapacity];
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int bagCapacity = 7;

        int dp[][] = new int[val.length+1][bagCapacity+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack_0_1(val,wt,bagCapacity,0,dp));

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}