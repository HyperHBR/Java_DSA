import java.util.ArrayList;

public class _05_Swap {
    public static void SwapNum(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(2);

        System.out.println(list);
        SwapNum(list, 1, 3);
        System.out.println(list);
    }
}
