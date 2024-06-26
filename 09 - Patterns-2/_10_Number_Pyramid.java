public class _10_Number_Pyramid {
    public static void printNumberPyramid(int Lines){
        //Outer Loop
        for(int i=1;i<=Lines;i++){
            //Spaces
            for(int j=1;j<=Lines-i;j++){
                System.out.print(" ");
            }
            //Numbers
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumberPyramid(5);
    }
}
