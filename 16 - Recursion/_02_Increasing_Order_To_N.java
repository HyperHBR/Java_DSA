public class _02_Increasing_Order_To_N {
    public static void printIncreasingToN(int Num){
        if(Num==1){
            System.out.print("1 ");
            return;
        }
        printIncreasingToN(Num-1);
        System.out.print(Num + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncreasingToN(n);
    }
}
