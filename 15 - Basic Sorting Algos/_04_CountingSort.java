public class _04_CountingSort {
    public static void CountingSort(int Arr[]){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        for(int i=0;i<Arr.length;i++){
            if(Arr[i]<Min){
                Min = Arr[i];
            }
            if(Arr[i]>Max){
                Max = Arr[i];
            }
        }

        int FreqArr[] = new int[Max-Min+1];

        for(int i=0;i<Arr.length;i++){
            FreqArr[Arr[i]-Min]++;
        }

        int MainArrayPointer = 0;

        for(int i=0;i<FreqArr.length;i++){
            while(FreqArr[i]>0){
                Arr[MainArrayPointer] = i + Min;
                MainArrayPointer++;
                FreqArr[i]--;
            }
        }
    }

    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int Arr[] = {1,4,1,3,2,4,3,7};
        CountingSort(Arr);
        printArray(Arr);
    }
}

//Negative Mate Left