import java.util.HashSet;
import java.util.Iterator;

public class _09_Iteration_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        //Adding
        hs.add("Hyper");
        hs.add("Toxic");
        hs.add("Dye");
        hs.add("Vedu");

        //Iteration Method
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        //For Loop
        for(String s : hs){
            System.out.print(s + " ");
        }
    }
}
