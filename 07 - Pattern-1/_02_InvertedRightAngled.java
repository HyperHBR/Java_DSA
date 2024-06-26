public class _02_InvertedRightAngled {
    public static void main(String[] args) {
        int Lines = 10;
        for(int i=1;i<=Lines;i++){
            for(int j=1;j<=Lines-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
