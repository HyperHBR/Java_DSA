import java.util.HashMap;
import java.util.LinkedHashMap;

public class _04_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("US",120);
        lhm.put("China",200);
        lhm.put("Switzerland",180);
        lhm.put("UK",80);

        System.out.println(lhm);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("US",120);
        hm.put("China",200);
        hm.put("Switzerland",180);
        hm.put("UK",80);

        System.out.println(hm);
    }
}
