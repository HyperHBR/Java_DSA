public class _01_MCM_Recursion{
    public static int mcmRec(int arr[],int i,int j){
        if(i==j){
            //One Element
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            //Set 1 : arr[i-1] X arr[k]
            int cost1 = mcmRec(arr,i,k);
            //Set 2 : arr[k] X arr[j]
            int cost2 = mcmRec(arr,k+1,j);
            //For Cross Product Of Set1 And Set2
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans,finalCost);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        System.out.println(mcmRec(arr,1,arr.length-1));
    }
}