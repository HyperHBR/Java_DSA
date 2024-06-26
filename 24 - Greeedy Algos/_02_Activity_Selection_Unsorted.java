import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _02_Activity_Selection_Unsorted{
    public static void main(String[] args) {
        int Start[] = {1,3,0,5,8,5};
        int End[] = {2,4,6,7,9,9};

        int Activities[][] = new int[Start.length][3];
        for(int i=0;i<Start.length;i++){
            Activities[i][0] = i;
            Activities[i][1] = Start[i];
            Activities[i][2] = End[i];
        }

        //Lambda Function
        Arrays.sort(Activities,Comparator.comparingDouble(o -> o[2]));

        //End Time Based Sorting
        int maxActivity = 0;
        ArrayList<Integer> Ans = new ArrayList<>();

        //Adding My First Activity
        maxActivity++;
        Ans.add(Activities[0][0]);
        int lastActEnd = Activities[1][0];

        for(int i=1;i<Start.length;i++){
            if(Activities[i][1]>=lastActEnd){
                maxActivity++;
                Ans.add(Activities[i][0]);
                lastActEnd = Activities[i][2];
            }
        }

        System.out.println("Maximum Activities That Can Be Selected : " + maxActivity);
        for(int i=0;i<Ans.size();i++){
            System.out.print("A" + Ans.get(i) + " ");
        }
    }
}