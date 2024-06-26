public class _02_Inverted_Rotated_Right_AngledTriangle {
    public static void InvertedRotatedPyramid(int Lines){
        for(int i=1;i<=Lines;i++){
            //Spaces
            for(int j=1;j<=Lines-i;j++){
                System.out.print("  ");
            }
            //Stars
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedRotatedPyramid(6);
    }
}
