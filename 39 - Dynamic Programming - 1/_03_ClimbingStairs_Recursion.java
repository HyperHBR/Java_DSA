public class _02_ClimbingStairs_Recursion {
    public static int climbingStairsRec(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1; //I Am At 0th Stair And I Can Stay There Which Can Be Considered As One Case
        }

        return climbingStairsRec(n-1) + climbingStairsRec(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbingStairsRec(n));
    }
}
