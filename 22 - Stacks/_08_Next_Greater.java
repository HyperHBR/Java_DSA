import java.util.Stack;

public class _08_Next_Greater {
    public static void nextGreaterElementRight(int Arr[],int nGE[]){
        Stack<Integer> s = new Stack<>();

        for(int i=Arr.length-1;i>=0;i--){
            //Removing Smaller Elements
            while(!s.isEmpty() && Arr[s.peek()]<=Arr[i]){
                s.pop();
            }


            if(s.isEmpty()){
                nGE[i] = -1;
            }

            else{
                nGE[i] = Arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nextGreaterElementLeft(int Arr[],int nGE[]){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<Arr.length;i++){
            //Removing Smaller Elements
            while(!s.isEmpty() && Arr[s.peek()]<=Arr[i]){
                s.pop();
            }


            if(s.isEmpty()){
                nGE[i] = -1;
            }

            else{
                nGE[i] = Arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nextSmallerElementRight(int Arr[],int nGE[]){
        Stack<Integer> s = new Stack<>();

        for(int i=Arr.length-1;i>=0;i--){
            //Removing Smaller Elements
            while(!s.isEmpty() && Arr[s.peek()]>=Arr[i]){
                s.pop();
            }


            if(s.isEmpty()){
                nGE[i] = -1;
            }

            else{
                nGE[i] = Arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void nextSmallerElementLeft(int Arr[],int nGE[]){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<Arr.length;i++){
            //Removing Smaller Elements
            while(!s.isEmpty() && Arr[s.peek()]>=Arr[i]){
                s.pop();
            }


            if(s.isEmpty()){
                nGE[i] = -1;
            }

            else{
                nGE[i] = Arr[s.peek()];
            }

            s.push(i);
        }
    }
    public static void main(String args[]){
        int Arr[] = {6,8,0,1,3,6,7,9,4,6,3};
        int nGR[] = new int[Arr.length];
        int nGL[] = new int[Arr.length];
        int nSR[] = new int[Arr.length];
        int nSL[] = new int[Arr.length];

        nextGreaterElementRight(Arr,nGR);
        nextGreaterElementLeft(Arr,nGL);
        nextSmallerElementRight(Arr,nSR);
        nextSmallerElementLeft(Arr,nSL);

        for(int i=0;i<nGR.length;i++){
            System.out.print(nGR[i] + " ");
        }
        System.out.println();
        for(int i=0;i<nGL.length;i++){
            System.out.print(nGL[i] + " ");
        }
        System.out.println();
        for(int i=0;i<nSR.length;i++){
            System.out.print(nSR[i] + " ");
        }
        System.out.println();
        for(int i=0;i<nSL.length;i++){
            System.out.print(nSL[i] + " ");
        }
    }
}
