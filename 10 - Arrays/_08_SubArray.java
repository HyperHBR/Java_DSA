public class _08_SubArray{
    public static void printSubArr(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            for(int j=i;j<Arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(Arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int Arr[] = {1,2,3,4,5};
        printSubArr(Arr);
    }
}