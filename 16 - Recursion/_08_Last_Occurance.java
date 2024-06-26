//First Look Forward
//Then Compare With Self

public class _08_Last_Occurance {
    public static int LastOccurance(int Arr[],int Key,int i){
        if(i==Arr.length){
            return -1;
        }
        int isFound = LastOccurance(Arr, Key, i+1);

        if(isFound == -1 && Arr[i]==Key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int Arr[] = {0,1,2,3,5,6,4,3,7,5,4,6};
        System.out.println(LastOccurance(Arr,5,0));
    }
}
