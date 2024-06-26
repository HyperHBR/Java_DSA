public class _01_Hollow_Rectangle{
    public static void HollowRect(int Rows,int Cols){
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=Cols;j++){
                if(i==1 || j==1 || i==Rows || j==Cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRect(9, 9);
    }
}