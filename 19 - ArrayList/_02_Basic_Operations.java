import java.util.ArrayList;

public class _02_Basic_Operations{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Adding Elements - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //Adding Element At An Index - O(n)
        list.add(0,0);
        list.add(4,2);

        //To Print
        System.out.println(list);

        //Getting An Element At A Specific Index - O(1)
        System.out.println(list.get(4));

        //Remove Element - O(n)
        list.remove(3);
        System.out.println(list);

        //Setting An Index - O(n)
        list.set(3,9);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(7));

        //Size
        System.out.println(list.size());

    }
}