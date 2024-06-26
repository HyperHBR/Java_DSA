import java.util.ArrayList;

public class _09_PairSum {
    //Way - 1 : Brute Force
    // Same As Previous One

    //Way - 2 : Two Pointer
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int LP = 0;
        int RP = list.size()-1;

        while(LP!=RP){
            if(list.get(LP)+list.get(RP) == target){
                return true;
            }

            if(list.get(LP)+list.get(RP) > target){
                RP--;
            }
            else{
                LP++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);

        System.out.println(pairSum(list,4));
    }
}
