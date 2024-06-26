import java.util.ArrayList;

public class _05_Max_Heap {
    public static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public int  peek(){
            return arr.get(0);
        }

        public void insert(int data){
            // Adding At The Last
            arr.add(data);
            
            //Index Of New Node
            int x = arr.size()-1;
            //Index Of New Node Parent
            int par = (x-1)/2;

            while(x > 0 && arr.get(x) > arr.get(par)){
                //Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                //Updating
                x = par;
                par = (x - 1) / 2;
            }
        }

        public void heapify(int idx){
            int leftChildIdx = idx*2+1;
            int rightChildIdx = idx*2+2;
            int maxIdx = idx;

            if(leftChildIdx < arr.size() && arr.get(leftChildIdx) > arr.get(maxIdx)){
                maxIdx = leftChildIdx;
            }  
            if(rightChildIdx < arr.size() && arr.get(rightChildIdx) > arr.get(maxIdx)){
                maxIdx = rightChildIdx;
            }  

            if(maxIdx != idx){
                //Swap
                int temp = arr.get(maxIdx);
                arr.set(maxIdx,arr.get(idx));
                arr.set(idx,temp);

                heapify(maxIdx);
            }
        }

        public int remove(){
            //Storing Data
            int data = arr.get(0);

            // Swapping First And Last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Removing That Node
            arr.remove(arr.size()-1);

            //Calling Heap Fixer : Heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String[] args) {
        Heap pq = new Heap();

        pq.insert(5);
        pq.insert(3);
        pq.insert(1);
        pq.insert(4);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
