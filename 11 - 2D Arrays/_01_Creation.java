import java.util.Scanner;

public class _01_Creation{
    public static void main(String[] args) {
        
        int Matrix[][] = new int[3][3];
        int Rows=3; //Matrix.length
        int Columns=3; //Matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<Rows;i++){
            for(int j=0;j<Columns;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        //Printing
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}