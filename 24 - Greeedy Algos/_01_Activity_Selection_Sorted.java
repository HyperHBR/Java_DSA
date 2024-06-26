import java.util.ArrayList;

public class _01_Activity_Selection_Sorted{
    public static void main(String[] args) {
        int Start[] = {1,3,0,5,8,5};
        int End[] = {2,4,6,7,9,9};

        //End Time Based Sorting
        int maxActivity = 0;
        ArrayList<Integer> Ans = new ArrayList<>();

        //Adding My First Activity
        maxActivity++;
        Ans.add(0);
        int lastActEnd = End[0];

        for(int i=1;i<Start.length;i++){
            if(Start[i]>=lastActEnd){
                maxActivity++;
                Ans.add(i);
                lastActEnd = End[i];
            }
        }

        System.out.println("Maximum Activities That Can Be Selected : " + maxActivity);
        for(int i=0;i<Ans.size();i++){
            System.out.print("A" + Ans.get(i) + " ");
        }
    }
}