public class _06_SortedArray{
    public static boolean isSorted(int Arr[],int Loc){
        if(Loc == Arr.length-1){
            return true;
        }
        if(Arr[Loc]>Arr[Loc+1]){
            return false;
        }
        return isSorted(Arr, Loc+1);
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,4,3,4,5};
        System.out.println(isSorted(Arr, 0));
    }
}