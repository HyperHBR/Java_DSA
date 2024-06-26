public class _06_Mountain_Ranges {
    public static int mountainRanges(int pairs){
        int dp[] = new int[pairs+1];

        //No Pair
        dp[0] = 1;
        //1 Pair
        dp[1] = 1;

        for(int i=2;i<pairs+1;i++){
            for(int j=0;j<i;j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }

        return dp[pairs];
    }
    public static void main(String[] args) {
        System.out.println(mountainRanges(5));
    }
}
