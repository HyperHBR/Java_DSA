public class _03_LinearSearch {

    public static int LinearSearch(int Numbers[],int Key){
        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]==Key){
                return i;
            }
        }
        return -1; //If Not Found
    }
    public static void main(String[] args) {
        int Numbers[] = {100,65,76,45,65,77,44,87,96,87,98,45};
        int Key = 44;

        int Index = LinearSearch(Numbers, Key);
        System.out.println("Index : " + Index);
    }
}
