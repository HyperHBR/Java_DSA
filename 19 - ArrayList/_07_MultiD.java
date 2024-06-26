import java.util.ArrayList;

public class _07_MultiD {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();
        ArrayList<Integer> L3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            L1.add(i);
            L2.add(i*2);
            L3.add(i*3);
        }

        mainList.add(L1);
        mainList.add(L2);
        mainList.add(L3);
        L2.remove(3);
        
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);

            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
