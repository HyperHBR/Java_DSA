public class _06_Clear_Last_I_Bits {
    public static int ClearLastIBits(int Num,int Places){
        int BitMask = ((~0)<<Places);
        return (Num&BitMask);
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIBits(10,1));
    }
}
