import java.util.HashMap;

public class _01_HashMap_Operation{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //Putting Data Into HashMap - O(1);
        System.out.println("\n---- Put Operation Performed ----");
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 20);
        
        //Printing
        System.out.println(hm);
        
        //Get Operation - O(1)
        System.out.println("\n---- Get Operation Performed ----");
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Nepal"));

        //Contains Key - O(1)
        System.out.println("\n---- Contains Key Operation Performed ----");
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nepal"));

        //Remove - O(1)
        System.out.println("\n---- Remove Operation Performed ----");
        System.out.println(hm.remove("India"));
        System.out.println(hm.remove("Nepal"));
        
        //Size
        System.out.println("\n---- Size Operation Performed ----");
        System.out.println(hm.size());

        //Clear
        System.out.println("\n---- Clear Operation Performed ----");
        hm.clear();
        System.out.println(hm.size());
    }
}