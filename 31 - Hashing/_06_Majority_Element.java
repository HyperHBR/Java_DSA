import java.util.HashMap;

public class _06_Majority_Element {
    public static void main(String[] args) {
        int Arr[] = {1,2,3,1,3,1,4,3,1,3};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<Arr.length;i++){
            // if(hm.containsKey(Arr[i])){
            //     hm.put(Arr[i],hm.get(Arr[i])+1);
            // }
            // else{
            //     hm.put(Arr[i],1);
            // }

            hm.put(Arr[i],hm.getOrDefault(Arr[i], 0) + 1);
        }

        for(int i : hm.keySet()){
            if(hm.get(i) > (Arr.length/3)){
                System.out.println(i);
            }
        }
    }
}
