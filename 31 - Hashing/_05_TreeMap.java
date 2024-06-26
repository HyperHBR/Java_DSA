import java.util.HashMap;
import java.util.TreeMap;

public class _05_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("US",120);
        tm.put("China",200);
        tm.put("Switzerland",180);
        tm.put("UK",80);

        System.out.println(tm);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("US",120);
        hm.put("China",200);
        hm.put("Switzerland",180);
        hm.put("UK",80);

        System.out.println(hm);
    }
}
