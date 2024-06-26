import java.util.Arrays;
import java.util.HashSet;

public class _02_Longest_Increasing_Subsequence {
    public static int longestIS(int Arr[]){
        HashSet<Integer> hs = new HashSet<>();

        //Only Unique
        for(int i=0;i<Arr.length;i++){
            hs.add(Arr[i]);
        }

        int Arr2[] = new int[hs.size()];
        int i=0;

        for(int x : hs ){
            Arr2[i++] = x;
        }

        Arrays.sort(Arr2);

        return LCS(Arr,Arr2);
    }

    public static int LCS(int Arr1[],int Arr2[]){
        int n = Arr1.length;
        int m = Arr2.length;

        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(Arr1[i-1] == Arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        int Arr[] = {10,2,5,6,50,30};
        
        System.out.println(longestIS(Arr));
    }
}

// class Solution {
//     public int lengthOfLIS(int[] Arr) {
//         HashSet<Integer> hs = new HashSet<>();

//         //Only Unique
//         for(int i=0;i<Arr.length;i++){
//             hs.add(Arr[i]);
//         }

//         int Arr2[] = new int[hs.size()];
//         int i=0;

//         for(int x : hs ){
//             Arr2[i++] = x;
//         }

//         Arrays.sort(Arr2);

//         return LCS(Arr,Arr2);
//     }
    
//     public int LCS(int Arr1[],int Arr2[]){
//         int n = Arr1.length;
//         int m = Arr2.length;

//         int dp[][] = new int[n+1][m+1];

//         for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 if(i==0 || j==0){
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(Arr1[i-1] == Arr2[j-1]){
//                     dp[i][j] = dp[i-1][j-1] + 1;
//                 }
//                 else{
//                     int ans1 = dp[i-1][j];
//                     int ans2 = dp[i][j-1];
//                     dp[i][j] = Math.max(ans1,ans2);
//                 }
//             }
//         }

//         return dp[n][m];
//     }
// }
