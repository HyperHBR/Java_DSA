public class _09_X_To_N {
    public static int XToN(int Num,int Pow){
        if(Pow == 0){
            return 1;
        }
        return Num * XToN(Num, Pow - 1);
    }
    public static void main(String[] args) {
        //X^N
        int X = 2;
        int N = 10;
        System.out.println(XToN(2,10));
    }
}
