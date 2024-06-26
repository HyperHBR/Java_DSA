import java.util.Scanner;

public class _02_Search {

    public static void Search(int Matrix[][],int key){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]==key){
                    System.out.println("Key Found");
                    System.out.println("Location : (" + i + "," + j +")");
                    return;
                }
            }
        }
        System.out.println("Key Not Found");
    }
    public static void main(String args[]){
        int Matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        Search(Matrix, 7);
    }    
}
