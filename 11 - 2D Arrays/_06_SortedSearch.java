public class _06_SortedSearch{
    public static void StairCaseSearch(int Matrix[][],int Key){
        //Considering Top Left Side
        int CurrentRow = 0;
        int CurrentCol = Matrix[0].length - 1;

        while(CurrentRow<Matrix.length && CurrentCol>=0){
            if(Key==Matrix[CurrentRow][CurrentCol]){
                System.out.println("Found Key At : ("+ CurrentRow + "," + CurrentCol +")");
                return;
            }
            else if(Key>Matrix[CurrentRow][CurrentCol]){
                CurrentRow++;
            }
            else if(Key<Matrix[CurrentRow][CurrentCol]){
                CurrentCol--;
            }
        }
        System.out.println("Key Not Found");
    }
    public static void main(String[] args) {
        int Matrix[][] = {  {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};

        StairCaseSearch(Matrix,33);
    }
}