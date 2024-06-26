public class _04_N_Queen_Just_Horizontal_Attack {
    public static void NQueens(char chessBoard[][],int CurrRow){
        if(CurrRow==chessBoard.length){
            printBoard(chessBoard);
            return;
        }
        for(int i=0;i<chessBoard.length;i++){
            chessBoard[CurrRow][i] = 'Q'; //Adding Q At A Place
            NQueens(chessBoard, CurrRow+1);
            chessBoard[CurrRow][i] = 'X'; //Removing Q From That Place
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-------------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Getting Size And Creating Empty Board
        int boardSize = 2;
        char chessBoard[][] = new char[boardSize][boardSize];

        //Initializing The Board
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                chessBoard[i][j] = 'X';
            }
        }

        NQueens(chessBoard,0);
    }
}
