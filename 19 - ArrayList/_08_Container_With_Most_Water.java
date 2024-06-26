import java.util.ArrayList;

public class _08_Container_With_Most_Water {
    // public static int MostWaterStored(ArrayList<Integer> Height){
    //     int MaxWater = 0;

    //     //BruteForce - O(n^2)
    //     for(int i=0;i<Height.size();i++){
    //         for(int j=i+1;j<Height.size();j++){
    //             int MinHeight = Math.min(Height.get(i),Height.get(j));
    //             int Width = j-i;
    //             MaxWater = Math.max(MaxWater,MinHeight*Width);
    //         }
    //     }
    //     return MaxWater;
    // }

    public static int MostWaterStored(ArrayList<Integer> Height){
        int MaxWater = 0;
        int LP = 0;
        int RP = Height.size()-1;

        while(LP<RP){
            int MinHeight = Math.min(Height.get(LP),Height.get(RP));
            int Width = RP-LP; 
            MaxWater = Math.max(MaxWater,MinHeight*Width);

            if(Height.get(LP)<Height.get(RP)){
                LP++;
            }
            else{
                RP--;
            }
        }

        return MaxWater;
    }

    //More Optimized
    // public static int MostWaterStored(ArrayList<Integer> Height){
    //     int MaxWater = 0;
    //     int LP = 0;
    //     int RP = Height.size()-1;

    //     while(LP<RP){
    //         int MinHeight = Math.min(Height.get(LP),Height.get(RP));
    //         int Width = RP-LP; 
    //         MaxWater = Math.max(MaxWater,MinHeight*Width);

    //         while(LP<RP && Height.get(LP)<=MinHeight){
    //             LP++;
    //         }
    //         while(LP<RP && Height.get(RP)<=MinHeight){
    //             RP--;
    //         }
    //     }

    //     return MaxWater;
    // }
    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println(MostWaterStored(Height));
    }
}
