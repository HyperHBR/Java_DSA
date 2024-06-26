import java.util.HashMap;

public class _16_Count_SubArrays_Sum_To_K {
    public static void main(String[] args) {
        int Arr[] = {10,-2,2,-20,10};
        int K = -10;

        //Sum,Count
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //If K = 10 And Arr[0] = 10 : 10-10 = 0 -> +1 Karshu
        map.put(0,1);

        //Count And Sum
        int Count = 0;
        int Sum = 0;
        
        for(int j=0;j<Arr.length;j++){
            //Calculating Sum Till J
            Sum += Arr[j];
            
            /*
             * This checks if there is a previous cumulative sum that,
             * when subtracted from the current cumulative sum Sum, equals K.
             * If such a cumulative sum exists, it means that the subarray
             * between the indices where this cumulative sum occurred and
             * the current index j sums to K.
             */

            if(map.containsKey(Sum-K)){
                //Ketli Vaar Aagad Avi Condition Ave Che Ke Sum[k] - Sum[i] = K
                Count += map.get(Sum-K);
            }

            map.put(Sum,map.getOrDefault(Sum, 0) + 1);
        }

        System.out.println(Count);
    }
}
