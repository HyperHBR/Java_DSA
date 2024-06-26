public class _11_Tiling_Problem{
    public static int TilingWays(int N){
        //Given 2*N Board
        //Tile : 2 * 1
        if(N==0 || N==1){
            return 1;
        }
        else{
            int VerticalKept = TilingWays(N-1);
            int HorizontalKept = TilingWays(N-2);
            return VerticalKept + HorizontalKept;
        }
        
    }
    public static void main(String[] args) {
        int N = 4;
        System.out.println(TilingWays(N));
    }
}