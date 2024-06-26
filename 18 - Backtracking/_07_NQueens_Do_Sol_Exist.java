public class _07_NQueens_Do_Sol_Exist {
    static int count = 0;

    public static boolean isSafe(char chessBoard[][],int CurrRow,int CurrentCol){
        //Vertically Up
        for(int i=CurrRow-1;i>=0;i--){
            if(chessBoard[i][CurrentCol]=='Q'){
                return false;
            }
        }
        for(int i=CurrRow-1,j=CurrentCol-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        for(int i=CurrRow-1,j=CurrentCol+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean NQueens(char chessBoard[][],int CurrRow){
        if(CurrRow==chessBoard.length){
            count++;
            return true;
        }
        for(int i=0;i<chessBoard.length;i++){
            if(isSafe(chessBoard, CurrRow, i)){
                chessBoard[CurrRow][i] = 'Q'; //Adding Q At A Place
                if(NQueens(chessBoard, CurrRow+1)){
                    return true;
                }
                chessBoard[CurrRow][i] = 'X'; //Removing Q From That Place
            }
        }
        return false;
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
        int boardSize = 3;
        char chessBoard[][] = new char[boardSize][boardSize];

        //Initializing The Board
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                chessBoard[i][j] = 'X';
            }
        }

        if(NQueens(chessBoard,0)){
            System.out.println("Sol Exist");
            printBoard(chessBoard);
        }
        else{
            System.out.println("Sol Doesnt Exist");
        }
    }
}
