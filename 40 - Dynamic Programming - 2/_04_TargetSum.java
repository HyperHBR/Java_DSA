public class _04_TargetSum {
    public static boolean targetSumPossible(int nums[],int targetSum){
        int n = nums.length;
        boolean dp[][] = new boolean [n+1][targetSum+1];

        //Initially All Will Be False
        //So We Just Need To Change The First Column (In C++ We Need TO Initialize First Row Also)

        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int val = nums[i-1];
                //Valid
                if(j>=val){
                    //Included
                    if(dp[i-1][j-val]){
                        dp[i][j] = true;
                    }
                    else if(dp[i-1][j]){
                        dp[i][j] = true;
                    }
                }
                else{
                    if(dp[i-1][j]){
                        dp[i][j] = true;
                    }
                }
            }
        }

        return dp[n][targetSum];
    }
    public static void main(String[] args) {
        int nums[] = {4,2,7,1,3};
        int targetSum = 18;

        System.out.println(targetSumPossible(nums,targetSum));
    }
}
