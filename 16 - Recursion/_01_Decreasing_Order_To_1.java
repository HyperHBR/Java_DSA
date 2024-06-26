public class _01_Decreasing_Order_To_1 {
    public static void printDecreasingToOne(int Num){
        if(Num==1){
            System.out.println("1");
            return;
        }
        System.out.print(Num + " ");
        printDecreasingToOne(Num-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDecreasingToOne(n);
    }
}
