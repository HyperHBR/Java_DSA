public class _02_SelectionSort{
    public static void SelectionSort(int Arr[]){
        for(int i=0;i<Arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[minPos]>Arr[j]){
                    minPos = j;
                }
            }
            if(minPos!=i){
                int Temp = Arr[i];
                Arr[i] = Arr[minPos];
                Arr[minPos] = Temp;
            }
        }
    }

    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int Arr[] = {5,4,3,2,1};
        SelectionSort(Arr);
        printArray(Arr);
    }
}