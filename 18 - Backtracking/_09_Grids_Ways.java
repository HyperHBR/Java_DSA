public class _09_Grids_Ways {
    public static int GridWays(int Rows,int Cols){
        long RowFact = 1;
        long ColFact = 1;
        long TotalFact = 1;

        for(int i=1;i<Rows;i++){
            RowFact *= i;
        }
        for(int j=1;j<Cols;j++){
            ColFact *= j;
        }
        for(int k=1;k<(Rows+Cols-1);k++){
            TotalFact *= k;
        }

        return (int)((TotalFact)/(RowFact*ColFact));
    }
    public static void main(String[] args) {
        int Rows = 10;
        int Cols = 10;

    System.out.println(GridWays(Rows,Cols));
    }
}
