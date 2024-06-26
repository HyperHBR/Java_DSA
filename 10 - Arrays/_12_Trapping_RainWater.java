public class _12_Trapping_RainWater { //O(n)
    public static int TrappedWater(int Arr[]){
        //Creating Left And Right Max Array
        int LeftMaxBoundary[] = new int[Arr.length];
        int RightMaxBoundary[] = new int[Arr.length];
        int CurrentLeftMax = 0;
        int CurrentRightMax = 0;

        //Filling The Auxiliary Arrays
        for(int i=0;i<Arr.length;i++){
            CurrentLeftMax = CurrentLeftMax > Arr[i] ? CurrentLeftMax : Arr[i];
            LeftMaxBoundary[i] = CurrentLeftMax;
        }
        for(int i=Arr.length-1;i>=0;i--){
            CurrentRightMax = CurrentRightMax > Arr[i] ? CurrentRightMax : Arr[i];
            RightMaxBoundary[i] = CurrentRightMax;
        }

        //Creating Logic For The Trapped Water
        int TrappedWater = 0;
        for(int i=1;i<Arr.length-1;i++){
            int MaxWaterLevel = Math.min(LeftMaxBoundary[i],RightMaxBoundary[i]);
            TrappedWater += (MaxWaterLevel-Arr[i]);
        }

        return TrappedWater;
    }

    public static void main(String[] args) {
        int Arr[] = {4,2,0,6,3,2,5};
        int Trapped = TrappedWater(Arr);
        System.out.println("Trapped Water = " + Trapped);
    }
}

//End Cases Are Left For 1 Or 2 Bars
