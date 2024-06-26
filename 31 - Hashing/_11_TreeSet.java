import java.util.HashSet;
import java.util.TreeSet;

public class _11_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
    
        ts.add(13);
        ts.add(3);
        ts.add(35);
        ts.add(43);
    
        System.out.println(ts);
        
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(13);
        hs.add(3);
        hs.add(35);
        hs.add(43);
        
        System.out.println(hs);
    }
}
