public class _04_Floyds_Traingle {
    public static void printFloydTriangle(int Lines){
        int Counter = 1;
        //Outer
        for(int i=1;i<=Lines;i++){
            //Inner Loop - To Print Counter Required Number Of Times
            for(int j=1;j<=i;j++){
                System.out.print(Counter++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printFloydTriangle(4);
    }
}
