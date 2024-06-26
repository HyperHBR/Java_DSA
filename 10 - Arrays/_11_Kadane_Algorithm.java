public class _11_Kadane_Algorithm {
    public static void KadaneAlgo(int Arr[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        boolean AllNegative = true;
        int MinNegative = Integer.MIN_VALUE;

        for(int i=0;i<Arr.length;i++){
            //For Special Case
            if(Arr[i]>0){
                AllNegative = false;
            }
            if(MinNegative < Arr[i]){
                MinNegative = Arr[i];
            }


            CurrentSum = CurrentSum + Arr[i];
            if(CurrentSum < 0){
                CurrentSum = 0;
            }
            if(CurrentSum > MaxSum){
                MaxSum = CurrentSum;
            }
        }

        if(AllNegative){
            System.out.println("Max SubArray Sum : " + MinNegative);
        }
        else{
            System.out.println("Max SubArray Sum : " + MaxSum);
        }
    }

    public static void main(String[] args) {
        int Arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int Arr2[] = {-5,-3,-7,-8};
        KadaneAlgo(Arr);
        KadaneAlgo(Arr2);
    }
}
