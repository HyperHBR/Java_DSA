public class _05_DIagonalSum {
    public static int DiagonalSum(int Matrix[][]){
        int Sum = 0;
        //Brute Force -> O(n^2)
        // for(int i=0;i<Matrix.length;i++){
        //     for(int j=0;j<Matrix[0].length;j++){
        //         //Due To If Else Overlapping Condition Covered
        //         if(i==j){
        //             Sum += Matrix[i][j];
        //         }
        //         else if(i+j == Matrix.length-1){
        //             Sum += Matrix[i][j];
        //         }
        //     }
        // }

        //Optimized - O(n)
        for(int i=0;i<Matrix.length;i++){
            //Primary
            Sum += Matrix[i][i];
            //Secondary
            if(i!=Matrix.length-i-1){
                Sum += Matrix[i][Matrix.length-i-1];
            }
        }

        return Sum;
    };
    public static void main(String[] args) {
        int Matrix[][] = {  {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        
        System.out.println(DiagonalSum(Matrix));
    }
}    
