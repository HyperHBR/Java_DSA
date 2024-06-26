public class _04_Spiral_Matrix {
    public static void PrintSpiral(int Matrix[][]){
        // Required Variables
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = Matrix.length - 1;
        int EndCol = Matrix[0].length - 1;

        while ((StartRow <= EndRow) && (StartCol <= EndCol)) {
            // Left to Right
            for (int i = StartCol; i <= EndCol; i++) {
                System.out.print(Matrix[StartRow][i] + " ");
            }
            StartRow++;

            // Top to Bottom
            for (int i = StartRow; i <= EndRow; i++) {
                System.out.print(Matrix[i][EndCol] + " ");
            }
            EndCol--;

            // Right to Left
            if (StartRow <= EndRow) {
                for (int i = EndCol; i >= StartCol; i--) {
                    System.out.print(Matrix[EndRow][i] + " ");
                }
                EndRow--;
            }

            // Bottom to Top
            if (StartCol <= EndCol) {
                for (int i = EndRow; i >= StartRow; i--) {
                    System.out.print(Matrix[i][StartCol] + " ");
                }
                StartCol++;
            }
        }
    }

    public static void main(String[] args) {
        int Matrix[][] = {  {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        
        PrintSpiral(Matrix);
    }
}
