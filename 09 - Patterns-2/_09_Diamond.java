public class _09_Diamond {
    public static void printDiamond(int Lines){
        //Top Part
        for(int i=1;i<=Lines;i++){
            //Spaces
            for(int j=1;j<=Lines-i;j++){
                System.out.print("  ");
            }
            //Stars = (2*i)-1
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Bottom Part
        for(int i=Lines;i>=1;i--){
            //Spaces
            for(int j=1;j<=Lines-i;j++){
                System.out.print("  ");
            }
            //Stars = (2*i)-1
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printDiamond(15);
    }
}
