//Total Pairs = n*(n-1) / 2

public class _07_Pairs_In_Array {
    public static void printPairs(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            for(int j=i+1;j<Arr.length;j++){
                System.out.print("(" + Arr[i] + "," + Arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Arr[] = {2,4,5,6,7};

        printPairs(Arr);
    }
}
