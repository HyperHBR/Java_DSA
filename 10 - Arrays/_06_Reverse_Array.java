public class _06_Reverse_Array {

    public static void ReverseArray(int Numbers[]){
        int First = 0;
        int Last = Numbers.length-1;
        while(First<Last){
            int temp = Numbers[First];
            Numbers[First] = Numbers[Last];
            Numbers[Last] = temp;

            First++;
            Last--;
        }
    }
    public static void main(String[] args) {
        int Number[] = {2,4,6,8};

        for(int i=0;i<Number.length;i++){
            System.out.print(Number[i] + " ");
        }
        System.out.println();

        ReverseArray(Number);

        for(int i=0;i<Number.length;i++){
            System.out.print(Number[i] + " ");
        }

    }

}
