public class _14_Interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        Rook r1 = new Rook();

        r1.moves();
        q1.moves();
    }    
}

interface ChessPieces{
    void moves();
}

class Queen implements ChessPieces{
    public void moves(){
        System.out.println("Up,Down,Left,Right,Diagonally");
    }
}

class Rook implements ChessPieces{
    public void moves(){
        System.out.println("Up,Down,Left,Right");
    }
}