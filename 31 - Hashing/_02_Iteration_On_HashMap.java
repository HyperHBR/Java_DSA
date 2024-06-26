import java.util.HashMap;
import java.util.Set;

public class _02_Iteration_On_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 20);
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println(k + " : " + hm.get(k));
        }
    }
}
