import java.util.HashMap;

public class _15_Max_SumArray_Sum_0 {
    public static void main(String[] args) {
        int Arr[] = {15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> Map = new HashMap<>();

        int Sum = 0;
        int maxLen = 0;

        for(int i=0;i<Arr.length;i++){
            Sum += Arr[i];
            if(Map.containsKey(Sum)){
                maxLen = Math.max(maxLen,i - Map.get(Sum));
            }
            else{
                Map.put(Sum,i);
            }
        }

        System.out.println(maxLen);
    }
}
