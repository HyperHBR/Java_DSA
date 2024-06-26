public class _09_SubArray_Sum {
    public static void printSumAndArray(int Arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int MinSum = Integer.MAX_VALUE;
        int Sum = 0;

        for(int Start=0;Start<Arr.length;Start++){
            for(int End=Start;End<Arr.length;End++){
                Sum = 0;
                for(int i=Start;i<=End;i++){
                    Sum += Arr[i];
                    System.out.print(Arr[i]+" ");
                }
                if(Sum>MaxSum){
                    MaxSum = Sum;
                }
                if(Sum<MinSum){
                    MinSum = Sum;
                }

                System.out.print(" --> Sum Is : " +Sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum Sum : " + MinSum);
        System.out.println("Maximum Sum : " + MaxSum);
    }

    public static void main(String[] args) {
        int Arr[] = {2,5,4,6,3,-1};
        printSumAndArray(Arr);
    }
}
