public class _11_Palindromic_Pattern {

    public static void printPalindromicPattern(int Lines){
        //Outer
        for(int i=1;i<=Lines;i++){
            //Spaces
            for(int j=1;j<=Lines-i;j++){
                System.out.print("  ");
            }
            //Numbers In Decreasing Order
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            //Numbers In Increasing Order
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPalindromicPattern(9);
    }
}
