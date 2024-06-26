public class _01_BubbleSort{
    public static void BubbleSort(int Arr[]){
        for(int i=0;i<Arr.length-1;i++){
            for(int j=0;j<Arr.length-1-i;j++){
                if(Arr[j]>Arr[j+1]){
                    int Temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = Temp;
                }
            }
        }
    }

    public static void OptimizedBubbleSort(int Arr[]){
        for(int i=0;i<Arr.length-1;i++){
            boolean SwappedInCurrentTurn = false;
            for(int j=0;j<Arr.length-1-i;j++){
                if(Arr[j]>Arr[j+1]){
                    int Temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = Temp;
                    SwappedInCurrentTurn = true;
                }
            }

            if(SwappedInCurrentTurn==false)
                return;
        }
    }

    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int Arr[] = {5,4,3,2,1};
        BubbleSort(Arr);
        printArray(Arr);
    }
}