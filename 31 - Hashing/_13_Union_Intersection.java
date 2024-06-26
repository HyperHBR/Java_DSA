import java.util.HashSet;

public class _13_Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = {4,3,5,2,6,4,2,3,1};
        int arr2[] = {4,3,2,3,2,1};

        HashSet<Integer> hs = new HashSet<>();

        //Union
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("--> Union");
        System.out.println(hs);
        System.out.println("Size = " + hs.size());
        System.out.println();

        hs.clear();

        //Intersection
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        System.out.println("\n-->Intersection :");
        
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                System.out.print(arr2[i] + " ");
                hs.remove(arr2[i]);
        }
    }
    System.out.print("\nSize = " + count);
}
}