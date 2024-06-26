import java.util.Scanner;

public class _03_Max_Min {

    public static void MaxSearch(int Matrix[][]){
        int MaxValue = Integer.MIN_VALUE;
        int MaxRow = -1;
        int MaxCol = -1;

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]>MaxValue){
                    MaxValue = Matrix[i][j];
                    MaxRow = i;
                    MaxCol = j;
                }
            }
        }
        System.out.println("Maximum Value Found At : (" + MaxRow + "," + MaxCol + ")");
    }

    public static void MinSearch(int Matrix[][]){
        int MinValue = Integer.MAX_VALUE;
        int MinRow = -1;
        int MinCol = -1;

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]<MinValue){
                    MinValue = Matrix[i][j];
                    MinRow = i;
                    MinCol = j;
                }
            }
        }
        System.out.println("Maximum Value Found At : (" + MinRow + "," + MinCol + ")");
    }
    public static void main(String args[]){
        int Matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        MaxSearch(Matrix);
        MinSearch(Matrix);
    }    
}
