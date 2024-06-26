import java.util.HashSet;
import java.util.LinkedHashSet;

public class _10_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    
        lhs.add(13);
        lhs.add(3);
        lhs.add(35);
        lhs.add(43);
    
        System.out.println(lhs);
        
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(13);
        hs.add(3);
        hs.add(35);
        hs.add(43);
        
        System.out.println(hs);
    }
}
