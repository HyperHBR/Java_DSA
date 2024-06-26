public class _05_BinarySearch {

    public static int BinarySearch(int Numbers[],int Key){
        int Start = 0;
        int End = Numbers.length - 1;

        while(Start<=End){
            int Mid = (Start+End)/2;

            if(Numbers[Mid] == Key){
                return Mid;
            } else if(Numbers[Mid] > Key) {
                End = Mid-1;
            } else {
                Start = Mid+1;
            }
        }

        return -1;
}
    public static void main(String[] args) {
        int Numbers[] = {2,4,6,8,23,34,45,56,77};
        int Key = 23;
        System.out.println(BinarySearch(Numbers, Key));
    }
}
