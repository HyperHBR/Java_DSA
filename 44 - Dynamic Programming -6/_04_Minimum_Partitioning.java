public class _04_Minimum_Partitioning {
    public static int knapsack_01(int arr[],int size,int W){
        int dp[][] = new int[size+1][W+1];

        //Initialization
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<size+1;i++){
            for(int j=1;j<W+1;j++){
                if(arr[i-1] <= j){//Valid
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]],dp[i-1][j]);
                }
                else{//Invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[size][W];
    }

    public static int minPartition(int arr[]){ //O(n*W)
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        int sum1 = knapsack_01(arr,n,sum/2);
        int sum2 = sum - sum1;

        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args) {
        int arr[] = {1,6,5,11,7};

        System.out.println(minPartition(arr));
    }
}
