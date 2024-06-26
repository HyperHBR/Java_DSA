public class _02_Fibonacci_Tabulation{
    static int dpCount = 1;

    public static int fib(int n){
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dpCount++;
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
        System.out.println(dpCount);
    }
}