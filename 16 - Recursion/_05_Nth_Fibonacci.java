public class _05_Nth_Fibonacci {
    public static int Fib(int N){
        if(N==0 || N==1){
            return N;
        }
        return Fib(N-1)+Fib(N-2);
    }
    public static void main(String[] args) {
        int N = 10;
        System.out.println(Fib(N));
    }
}
