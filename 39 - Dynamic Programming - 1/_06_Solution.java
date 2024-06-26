public class _06_Solution {
    public static int rob(int nums[],int i){
        if(i>=nums.length){
            return 0;
        }

        int currentSelected = nums[i] + rob(nums, i+2);
        int currentNotSelected = rob(nums, i+1);
        

        return Math.max(currentNotSelected,currentSelected);
    }

    public static void main(String[] args) {
        int Arr[] = {2,1,5,4,3,4};
        System.out.println(rob(Arr,0));
    }
}

//2 Ways
//Current House Selected
// -> Skip Next
//Current House Not Selected
// -> Can Select The Next
