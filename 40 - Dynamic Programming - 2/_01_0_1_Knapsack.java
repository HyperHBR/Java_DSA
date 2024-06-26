public class _01_0_1_Knapsack{

    public static int knapsack_0_1(int val[],int wt[],int bagCapacity,int idx){
        if(bagCapacity == 0 || idx == val.length){
            return 0;
        }

        //Valid
        if(wt[idx] <= bagCapacity){
            int Included = knapsack_0_1(val, wt, bagCapacity-wt[idx], idx+1) + val[idx];
            int Excluded = knapsack_0_1(val, wt, bagCapacity, idx+1);

            return Math.max(Included, Excluded);
        }
        else{
            return knapsack_0_1(val, wt, bagCapacity, idx+1);
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int bagCapacity = 7;

        System.out.println(knapsack_0_1(val,wt,bagCapacity,0));
    }
}