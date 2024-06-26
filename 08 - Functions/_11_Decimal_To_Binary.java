public class _11_Decimal_To_Binary{

    public static int DecimalToBinary(int DecNum){
        int Pow = 0;
        int BinNum = 0;

        while(DecNum != 0){
            int Rem = DecNum%2;
            BinNum = BinNum + Rem*(int)(Math.pow(10,Pow));
            DecNum /= 2;
            Pow++;
        }

        return BinNum;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBinary(6));
    }
}