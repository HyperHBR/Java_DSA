public class _14_Binary_Strings {
    //Print All String With No Consecutive Ones
    public static void PrintBinaryStrings(int Num,int LastPlace,String str){
        if(Num==0){
            System.out.println(str);
            return;
        }

        PrintBinaryStrings(Num-1, 0, str+"0");

        if(LastPlace==0){
            PrintBinaryStrings(Num-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int N=3;
        PrintBinaryStrings(N,0,"");
    }
}
