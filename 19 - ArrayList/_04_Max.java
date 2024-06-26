import java.util.ArrayList;

public class _04_Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(2);

        int Max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            Max = Math.max(Max,list.get(i));
        }

        System.out.println(Max);
    }
}
