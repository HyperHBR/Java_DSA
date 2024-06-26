import java.util.Stack;

public class _11_Max_Area_In_Histogram {
    public static void leftSmallerFinder(int Arr[],int leftSmaller[]){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<Arr.length;i++){
            int curr = Arr[i];
            while(!s.isEmpty() && Arr[s.peek()]>=curr){
                s.pop();
            }
            if(s.isEmpty()){
                leftSmaller[i] = -1;
            }
            else{
                leftSmaller[i] = s.peek();
            }

            s.push(i);
        }
    }

    public static void rightSmallerFinder(int Arr[],int rightSmaller[]){
        Stack<Integer> s = new Stack<>();

        for(int i=Arr.length-1;i>=0;i--){
            int curr = Arr[i];
            while(!s.isEmpty() && Arr[s.peek()]>=curr){
                s.pop();
            }
            if(s.isEmpty()){
                rightSmaller[i] = Arr.length; //For Finding Difference
            }
            else{
                rightSmaller[i] = s.peek();
            }

            s.push(i);
        }
    }


    public static int MaxAreaInHist(int Arr[]){
        int Size = Arr.length;

        //Creating Auxillary Arrays
        //Left Smaller
        int leftSmaller[] = new int[Size];
        int rightSmaller[] = new int[Size];

        leftSmallerFinder(Arr,leftSmaller);
        rightSmallerFinder(Arr,rightSmaller);

        int Max = 0;
        for(int i=0;i<Arr.length;i++){
            int Area = Arr[i] * (rightSmaller[i]-leftSmaller[i]-1);
            Max = Math.max(Max,Area);
        }

        return Max;
    }
    public static void main(String[] args) {
        int Arr[] = {2,1,5,6,2,3};
        System.out.println(MaxAreaInHist(Arr));

        // int leftSmaller[] = new int[Arr.length];
        // int rightSmaller[] = new int[Arr.length];

        // leftSmallerFinder(Arr,leftSmaller);
        // rightSmallerFinder(Arr,rightSmaller);

        // for(int i=0;i<Arr.length;i++){
        //     System.out.print(leftSmaller[i] + " ");
        // }
        // System.out.println();
        // for(int i=0;i<Arr.length;i++){
        //     System.out.print(rightSmaller[i] + " ");
        // }
    }
}
