public class _06_Heap_Sort {

    public static void heapify(int arr[],int idx,int size){
        int leftChildIdx = 2*idx+1;
        int rightChildIdx = 2*idx+2;
        int maxIdx = idx;

        if(leftChildIdx < size && arr[leftChildIdx] > arr[maxIdx]){
            maxIdx = leftChildIdx;
        }  
        if(rightChildIdx < size && arr[rightChildIdx] > arr[maxIdx]){
            maxIdx = rightChildIdx;
        }       
        if(maxIdx != idx){
            //Swap
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[idx];
            arr[idx] = temp;

            heapify(arr,maxIdx,size);
        }

    }

    public static void heapSort(int arr[]){
        //S1 = Build Max Heap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //S2 = Push The Largest At
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        heapSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
