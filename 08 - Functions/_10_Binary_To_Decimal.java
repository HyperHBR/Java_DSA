public class _10_Binary_To_Decimal{

    public static int BinaryToDecimal(int Num){
        int Dec = 0;
        int CurrentPow = 0;
        while(Num>0){
            int LastDigit = Num%10;
            Dec = Dec + LastDigit*(int)(Math.pow(2, CurrentPow));
            Num /= 10;
            CurrentPow++;
        }
        return Dec;
    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal(1111));
    }
}