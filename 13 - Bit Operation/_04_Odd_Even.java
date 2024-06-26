public class _04_Odd_Even {
    public static void OddEven(int Num){
        int BitMask = 1;
        if((Num&BitMask) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        OddEven(3);
        OddEven(6);
        OddEven(11);
    }
}
