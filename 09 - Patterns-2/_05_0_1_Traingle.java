public class _05_0_1_Traingle {
    public static void ZeroOneTriangle(int Lines){
        for(int i=1;i<=Lines;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ZeroOneTriangle(6);
    }
}
