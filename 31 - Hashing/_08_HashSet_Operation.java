import java.util.HashSet;

public class _08_HashSet_Operation {
    public static void main(String[] args) {
        // HashSet Operation
        HashSet<Integer> hs = new HashSet<>();

        // Add Operation
        hs.add(13);
        hs.add(3);
        hs.add(35);
        hs.add(43);
        
        System.out.println(hs);
        
        // Contains Operation
        System.out.println(hs.contains(3));
        System.out.println(hs.contains(7));
        
        // Remove Operation
        hs.remove(43);
        System.out.println(hs); 

    }
}
