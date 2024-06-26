import java.util.Arrays;
import java.util.Comparator;

public class _03_Fractional_Knapsack {
    public static void main(String[] args) {
        int Val[] = {120,100,60};
        int Weight[] = {30,20,10};
        int totalItems = Val.length;

        int bagCapacity = 50;

        double Ans = 0;

        // Sorting Ratio Descendingly
        double Ratio[][] = new double[totalItems][2];
        // 0thCol -> Index
        // 1stCol -> Ratio

        for(int i=0;i<totalItems;i++){
            Ratio[i][0] = i;
            Ratio[i][1] = Val[i]/(double)Weight[i]; //Double IMP
        }

        for(int i=0;i<totalItems;i++){
            System.out.println(Ratio[i][0] + " " + Ratio[i][1]);
        }
        
        //Ascending Sort
        Arrays.sort(Ratio,Comparator.comparingDouble(o -> o[1]));

        //Now Reverse Goint
        for(int i=totalItems-1;i>=0;i--){
            int currWeight = Weight[(int)Ratio[i][0]];
            if(currWeight<=bagCapacity){
                Ans += currWeight*Ratio[i][1];
                bagCapacity -= currWeight;
            }
            else{
                int weightTaken = bagCapacity;
                Ans += weightTaken*Ratio[i][1];
                break;
            }
        }

        System.out.println(Ans);
    }
}
