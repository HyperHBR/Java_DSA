public class _03_Inverted_Number_Pyramid {
    public static void InvertedNumberPyramid(int Lines){
        for(int i=1;i<=Lines;i++){
            for(int j=1;j<=Lines-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedNumberPyramid(6);
    }
}
