import java.util.ArrayList;

public class _10_Rotated_PairSum{
    public static boolean RotPairSum(ArrayList<Integer> list,int Target) {
        int BreakingPoint = -1; //Not Found Currently
        int N = list.size();

        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                BreakingPoint=i;
                break;
            }
        }
        
        int LP = BreakingPoint+1;
        int RP = BreakingPoint;

        while(LP!=RP){
            int sum = list.get(LP)+list.get(RP);
            if(sum==Target){
                return true;
            }
            else if(sum>Target){
                RP = (N+RP-1)%N;
            }
            else{
                LP = (LP+1)%N;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);

        System.out.println(RotPairSum(list,12));
    }
}