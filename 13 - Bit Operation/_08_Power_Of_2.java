public class _08_Power_Of_2 {
    public static boolean PowerOf2(int Num){
        return (Num&(Num-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(PowerOf2(8));
    }
}
