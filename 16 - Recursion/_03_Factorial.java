public class _03_Factorial {
    public static int Fact(int Num){
        if(Num==0){
            return 1;
        }
        else{
            return Num*Fact(Num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
