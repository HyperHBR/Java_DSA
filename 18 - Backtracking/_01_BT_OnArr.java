public class _01_BT_OnArr{
    public static void changeArr(int Arr[],int idx,int val){
        if(idx == Arr.length){
            printArr(Arr);
            System.out.println();
            return;
        }

        Arr[idx] = val;
        changeArr(Arr, idx+1, val+1);
        Arr[idx] -= 2;
    }
    public static void printArr(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int Arr[] = new int[5];
        changeArr(Arr,0,1);
        printArr(Arr);
    }
}