public class _07_First_Occurance {
    public static int FirstOccurance(int Arr[],int Key,int i){
        if(i == Arr.length){
            return -1;
        }
        if(Arr[i]==Key){
            return i;
        }
        
        return FirstOccurance(Arr, Key, i+1);
    }
    public static void main(String[] args) {
        int Arr[] = {0,1,2,3,5,6,4,3,7,5,4,6};
        System.out.println(FirstOccurance(Arr,9,0));
    }
}
