public class _02_MCM_Memo {
    public static int mcmMemo(int arr[],int i,int j,int dp[][]){
        if(i==j){
            //One Element
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            //Set 1 : arr[i-1] X arr[k]
            int cost1 = mcmMemo(arr,i,k,dp);
            //Set 2 : arr[k] X arr[j]
            int cost2 = mcmMemo(arr,k+1,j,dp);
            //For Cross Product Of Set1 And Set2
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans,finalCost);
            dp[i][j] = ans;
        }

        return dp[i][j];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};

        int dp[][] = new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(mcmMemo(arr,1,arr.length-1,dp));

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
