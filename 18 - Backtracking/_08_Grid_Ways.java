public class _08_Grid_Ways {
    public static int GridWays(int Rows,int Cols,int CurrRow,int CurrentCol){
        if(CurrRow==Rows-1 && CurrentCol==Cols-1){
            return 1;
        }
        else if(CurrRow == Rows || CurrentCol == Cols){
            return 0;
        }
        
        int W1 = GridWays(Rows,Cols,CurrRow+1,CurrentCol);
        int W2 = GridWays(Rows,Cols,CurrRow,CurrentCol+1);
        return W1+W2;
    }
    public static void main(String[] args) {
        int Rows = 3;
        int Cols = 3;

        System.out.println(GridWays(Rows,Cols,0,0));
    }
}
