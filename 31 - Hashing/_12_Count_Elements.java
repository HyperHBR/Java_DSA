import java.util.HashSet;

public class _12_Count_Elements {
    public static void main(String[] args) {
        int Arr[] = {1,3,2,4,2,3,5,4,3,2,6,1,7,6,5,4};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<Arr.length;i++){
            hs.add(Arr[i]);
        }

        System.out.println(hs.size());
    }
}
