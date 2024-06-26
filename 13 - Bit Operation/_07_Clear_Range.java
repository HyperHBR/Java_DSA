public class _07_Clear_Range {
    public static int ClearRangeOfBits(int Num,int Start,int End){
        int A = (~0)<<(End+1);
        int B = (1<<Start)-1;
        int BitMask = A | B;

        return (Num&BitMask);
    }
    public static void main(String[] args) {
        System.out.println(ClearRangeOfBits(31,2,3));
    }
}
