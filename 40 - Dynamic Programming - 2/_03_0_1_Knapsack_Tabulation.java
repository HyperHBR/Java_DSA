import java.util.Arrays;

public class _03_0_1_Knapsack_Tabulation{

    public static int knapsack_0_1(int val[],int wt[],int bagCapacity){
        int n = val.length;
        int dp[][] = new int[n+1][bagCapacity+1];

        //Row Initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        //Col Initialization
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<bagCapacity+1;j++){
                if(wt[i-1] <= j){ //Valid
                    
                    int Included = val[i-1] + dp[i-1][j-wt[i-1]];
                    int Excluded = dp[i-1][j];
                    
                    dp[i][j] = Math.max(Included,Excluded);
                } 
                else{ //Invalid
                    int Excluded = dp[i-1][j];
                    dp[i][j] = Excluded;

                }
            }
        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<bagCapacity+1;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[n][bagCapacity]; //Last Column
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int bagCapacity = 7;

        System.out.println(knapsack_0_1(val,wt,bagCapacity));
    }
}