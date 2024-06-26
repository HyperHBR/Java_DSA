public class _04_FirstNSum {
    public static int FirstNSum(int Num){
        if(Num==1){
            return 1;
        }
        else{
            return Num+FirstNSum(Num-1);
        }
    }
    public static void main(String[] args) {
        int Num = 5;
        System.out.println(FirstNSum(Num));
    }
}
