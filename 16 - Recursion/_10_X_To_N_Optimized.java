public class _10_X_To_N_Optimized {
    //Big O - log N
    //ODD EVEN POWER CONCEPT

    public static int XToN(int Num,int Pow){
        if(Pow == 0){
            return 1;
        }

        int Value = XToN(Num, Pow/2);

        if(Pow%2==0){
            return Value * Value;
        }
        else{
            return Value * Value * Num;
        }
    }
    public static void main(String[] args) {
        //X^N
        int X = 2;
        int N = 10;
        System.out.println(XToN(2,10));
    }
}
