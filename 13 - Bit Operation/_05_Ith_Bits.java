public class _05_Ith_Bits {
    public static int GetIthBit(int Num,int Location){
        int BitMask = (1<<Location);
        
        if((Num&BitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int SetIthBit(int Num,int Location){
        int BitMask = (1<<Location);
        return (Num|BitMask);
    }

    public static int ClearIthBit(int Num,int Location){
        int BitMask = ~(1<<Location);
        return (Num&BitMask);
    }

    public static int UpdateIthBit(int Num,int Location,int UpdateValue){
        // if(UpdateValue==1){
        //     SetIthBit(Num, Location);
        // }
        // else{
        //     ClearIthBit(Num, Location);
        // }

        // OR

        int N = (Num & (~(1<<Location)));
        return N | (UpdateValue<<Location);
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(5,2,0));
    }
}
