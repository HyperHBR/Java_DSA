public class _03_Search_In_Rotated_Array {
    public static int SearchInRotatedArray(int Arr[],int Key,int Si,int Ei){
        if(Si>Ei){
            return -1;
        }

        int Mid = Si + (Ei-Si)/2;

        //Found
        if(Arr[Mid] == Key){
            return Mid;
        }

        //Mid On L1
        else if(Arr[Si]<=Arr[Mid]){
            //L1 Left
            if(Arr[Si]<=Key && Key<Arr[Mid]){
                return SearchInRotatedArray(Arr, Key, Si, Mid-1);
            }
            //Mid Right
            else{
                return SearchInRotatedArray(Arr, Key, Mid+1, Ei);
            }
        }

        //Mid On L2
        else{
            //L2 Right
            if(Arr[Mid]<Key && Key<=Arr[Ei]){
                return SearchInRotatedArray(Arr, Key, Mid+1, Ei);
            }
            //Mid Left
            else{
                return SearchInRotatedArray(Arr, Key, Si, Mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int RotatedArr[] = {4,5,6,7,0,1,2};
        System.out.println(SearchInRotatedArray(RotatedArr, 7,0,RotatedArr.length-1));
    }
}
