import java.util.HashMap;

public class _14_Find_Itinerary {
    public static String getStart(HashMap<String,String> map){
        //Building A RevMap
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : map.keySet()){
            revMap.put(map.get(key),key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String startPoint = getStart(map);

        System.out.print(startPoint);

        for(String key : map.keySet()){
            System.out.print("-->" + map.get(startPoint));
            startPoint = map.get(startPoint);
        }
    }
}
