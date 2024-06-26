public class _08_Hollow_Rhombus {
    public static void printHollowRhombus(int Lines){
        //Outer Loop
        for(int i=1;i<=Lines;i++){
            //Spaces = Lines - i
            for(int j=1;j<=(Lines-i);j++){
                System.out.print("  ");
            }
            //Stars And Spaces
            for(int j=1;j<=Lines;j++){
                //Boundary Condition
                if(i==1 || j==1 || i==Lines || j==Lines){
                    System.out.print("* ");
                }
                //Internal Spaces
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollowRhombus(5);
    }
}
