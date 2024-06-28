public class _10_Sudoku_Solver {
    public static boolean isSafe(int SudokuBoard[][],int Row,int Col,int Digit){
        //For Row
        for(int i=0;i<9;i++){
            if(i!=Col && SudokuBoard[i][Col]==Digit)
                return false;
        }
        
        //For Column
        for(int i=0;i<9;i++){
            if(i!=Row && SudokuBoard[Row][i]==Digit)
                return false;
        }

        //For Grid
        int GridStartRow = (Row/3) * 3;
        int GridStartCol = (Col/3) * 3;

        for(int i=GridStartRow;i<GridStartRow+3;i++){
            for(int j=GridStartCol;j<GridStartCol+3;j++){
                if(i!=Row && j!=Col && SudokuBoard[i][j]==Digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean SudokuSolver(int SudokuBoard[][],int Row,int Col){
        //Last Column And Row Complete Thaya Pachi
        if(Row==9){
            return true;
        }
        int NextRow = Row;

        int NextCol = Col+1;
        if(NextCol==9){
            NextRow+=1;
            NextCol=0;
        }

        if(SudokuBoard[Row][Col]!=0){
            return SudokuSolver(SudokuBoard, NextRow, NextCol);
        }
        
        for(int Digit=1;Digit<=9;Digit++){
            if(isSafe(SudokuBoard,Row,Col,Digit)){
                SudokuBoard[Row][Col] = Digit;
                if(SudokuSolver(SudokuBoard, NextRow, NextCol)){
                    return true;
                    }
                SudokuBoard[Row][Col] = 0;
            }
        }

        return false;
    }

    public static void printBoard(int SudokuBoard[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(SudokuBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int SudokuBoard[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,0,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };
        
        if(SudokuSolver(SudokuBoard, 0, 0)){
            System.out.println("Solved Sudoku Board:");
            printBoard(SudokuBoard);
        }
        else{
            System.out.println("No Solution");
        }
    }
}
