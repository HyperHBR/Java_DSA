public class _05_Factorial {
    public static int calcFact(int Num){
        int Fact = 1;
        while(Num>1){
            Fact *= Num;
            Num--;
        }
        return Fact;
    }
    public static void main(String[] args) {
        int Fact = calcFact(5);
        System.out.println(Fact);
    }
}
