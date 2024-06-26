public class _01_MergeSort{
    public static void printArray(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
    }

    public static void MergeSort(int Arr[],int Si,int Ei){
        if(Si>=Ei){
            return;
        }

        int Mid = Si + (Ei-Si)/2;

        MergeSort(Arr, Si, Mid);
        MergeSort(Arr,Mid+1,Ei);
        Merge(Arr, Si, Ei,Mid);
    }

    public static void Merge(int Arr[],int Si,int Ei,int Mid){
        // Eg. L:(0,3) R:(4,6) : Total -- 7 = 6-0+1
        int Temp[] = new int[Ei-Si+1];

        //Iterators
        int Li = Si; //Left Part Iterator
        int Ri = Mid+1; //Right Part Iterator
        int Ti = 0; //Temp Iterator

        while(Li<=Mid && Ri<=Ei){
            if(Arr[Li]<Arr[Ri]){
                Temp[Ti++] = Arr[Li++];
            }
            else{
                Temp[Ti++] = Arr[Ri++];
            }
        }

        while(Li<=Mid){
            Temp[Ti++] = Arr[Li++];
        }

        while(Ri<=Ei){
            Temp[Ti++] = Arr[Ri++];
        }

        for(Ti=0,Li=Si;Ti<Temp.length;Ti++,Li++){
            Arr[Li] = Temp[Ti];
        }
    }

    public static void main(String[] args) {
        int Arr[] = {6,3,4,7,9,5};
        MergeSort(Arr,0,Arr.length-1);
        printArray(Arr);
    }
}