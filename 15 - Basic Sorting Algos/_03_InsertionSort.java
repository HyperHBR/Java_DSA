public class _03_InsertionSort{
    public static void InsertionSort(int Arr[]){
        for(int i=1;i<Arr.length;i++){
            int Current = Arr[i];
            int Prev = i-1;
            while(Prev>=0 && Arr[Prev]>Current){
                Arr[Prev+1] = Arr[Prev];
                Prev--; 
            }
            Arr[Prev+1] = Current;
        }
    }

    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int Arr[] = {5,4,3,2,1};
        InsertionSort(Arr);
        printArray(Arr);
    }
}