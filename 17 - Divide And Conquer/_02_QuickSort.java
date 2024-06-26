public class _02_QuickSort {
    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void QuickSort(int Arr[],int Si,int Ei){
        if(Si>=Ei){
            return;
        }
        //Last Element Will Be My Pivot
        int PivotIndex = Partition(Arr,Si,Ei);
        QuickSort(Arr, Si, PivotIndex-1);
        QuickSort(Arr, PivotIndex+1, Ei);
    }

    public static int Partition(int Arr[],int Si,int Ei){
        int Pivot = Arr[Ei];

        int NewPtr = Si-1;

        for(int j=Si;j<Ei;j++){
            if(Arr[j]<=Pivot){
                NewPtr++;
                int temp = Arr[NewPtr];
                Arr[NewPtr] = Arr[j];
                Arr[j] = temp;
            }
        }
        NewPtr++;
        int temp = Pivot;
        Arr[Ei] = Arr[NewPtr];
        Arr[NewPtr] = temp;

        return NewPtr;
    }

    public static void main(String[] args) {
        int Arr[] = {4,32,6,3,4,1,6,7};
        QuickSort(Arr,0,Arr.length-1);
        printArray(Arr);
    }
}
