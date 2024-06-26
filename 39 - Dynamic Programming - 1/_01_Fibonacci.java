public class _01_Fibonacci{
    static int recCount = 1;
    static int dpCount = 1;

    public static int fibRec(int n){
        if(n==0 || n==1){
            return n;
        }
        recCount++;
        return fibRec(n-1) + fibRec(n-2);
    }

    public static int fibDP(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }

        f[n] = fibDP(n-1, f) + fibDP(n-2, f);
        dpCount++;
        return f[n];
    }
    public static void main(String[] args) {
        int n =8;
        int f[] = new int[n+1];
        System.out.println(fibRec(n));
        System.out.println(fibDP(n,f));

        System.out.println(recCount);
        System.out.println(dpCount);
    }
}