public class _10_Fast_Exp {
    public static int FastExponentiation(int Num,int Power){
        int Ans = 1;
        while(Power>0){
            if((Power&1) == 1){
                Ans *= Num;
            }
            Num*=Num;
            Power = Power>>1;
        }

        return Ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExponentiation(3,5));
    }
}
