//TC = n^2 < n^3

public class _10_Prefix_Sum {
    public static void maxSumPrefix(int Arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        int PrefixSumArr[] = Arr;

        for(int i=0;i<Arr.length;i++){
            CurrentSum += Arr[i];
            PrefixSumArr[i] = CurrentSum;
        }
        
        CurrentSum = 0;

        for(int Start=1;Start<Arr.length;Start++){
            for(int End=Start;End<Arr.length;End++){
                CurrentSum = Start == 0 ? PrefixSumArr[0] : PrefixSumArr[End] - PrefixSumArr[Start-1];

                if(CurrentSum>MaxSum){
                    MaxSum=CurrentSum;
                }
            }
        }

        System.out.println(MaxSum);
    }
    
    public static void main(String[] args) {
        int Arr[] = {1,-2,6,-1,3};
        maxSumPrefix(Arr);
    }
}
