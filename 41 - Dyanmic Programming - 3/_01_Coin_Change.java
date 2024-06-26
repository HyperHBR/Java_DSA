public class _01_Coin_Change{
    public static int totalCoinChanges(int Coins[],int Sum){
        int n = Coins.length;
        int dp[][] = new int[n+1][Sum+1];

        //Initialization - Sum = 0 -> No Coins Required -> 1 Way
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        //Initialization - Coins = 0 -> Not Possible -> 0 Way
        for(int i=1;i<Sum+1;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<Sum+1;j++){
                int curr = Coins[i-1];
                if(curr<=j){
                    dp[i][j] = dp[i][j-curr] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][Sum];
    }
    public static void main(String[] args) {
        int Coins[] = {2,3,5};
        int Sum = 10;

        System.out.println(totalCoinChanges(Coins,Sum));
    }
}