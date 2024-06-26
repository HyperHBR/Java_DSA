public class _02_Rod_Cutting{
    public static int maxProfitRodCutting(int length[],int prices[],int rodLength){
        int n = length.length;
        int dp[][] = new int[n+1][rodLength+1];

        //length = Value
        //prices = Weight
        //rodLength = badCapacity

        //Initialization - length = 0 -> Parts Required -> 0
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        //Initialization - rodLength = 0 -> No Part Requires -> 0
        for(int i=0;i<rodLength+1;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                if(length[i-1]<=j){
                    int Include = prices[i-1] + dp[i][j-length[i-1]];
                    int Exclude = dp[i-1][j];

                    dp[i][j] = Math.max(Include,Exclude);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int Lengths[] = {1,2,3,4,5,6,7,8};
        int Prices[] = {1,5,8,9,10,17,17,20};
        int rodLength = 8;

        System.out.println(maxProfitRodCutting(Lengths,Prices,rodLength));
    }
}