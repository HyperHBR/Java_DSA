public class _07_Solid_Rhombus {
    public static void printSolidRhombus(int Lines){
        //Outer Loop
        for(int i=1;i<=Lines;i++){
            //Spaces = Lines - i
            for(int j=1;j<=(Lines-i);j++){
                System.out.print("  ");
            }
            //Stars
            for(int j=1;j<=Lines;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSolidRhombus(5);
    }
}
