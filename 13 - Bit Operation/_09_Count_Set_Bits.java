public class _09_Count_Set_Bits {
    public static int CountSetBits(int Num){
        int Count = 0;
        while(Num>0){
            if((Num&1) != 0){ // Checking LSB
                Count++;
            }
            Num = Num>>1;
        }
        return Count;
    }
    public static void main(String[] args) {
        System.out.println(CountSetBits(16));
    }
}
