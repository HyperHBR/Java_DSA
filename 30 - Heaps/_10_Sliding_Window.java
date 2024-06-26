import java.util.Comparator;
import java.util.PriorityQueue;

public class _10_Sliding_Window {
    public static class Info implements Comparable<Info>{
        int idx;
        int data;

        public Info(int idx, int data) {
            this.idx = idx;
            this.data = data;
        }

        @Override
        public int compareTo(Info o2) {
            return this.data - o2.data;
        }
    }

    public static int[] maxSlidingWindow(int Arr[],int K){
        if (K <= 0 || Arr == null || Arr.length == 0) 
            return new int[0];
        if (K == 1) return Arr;

        int res[] = new int[Arr.length-K+1];
        int currentIdxRes = 0;
        int currentIdxArr = 0;
        
        PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(;currentIdxArr<K && currentIdxArr<Arr.length;currentIdxArr++){
            pq.add(new Info(currentIdxArr, Arr[currentIdxArr]));
        }

        res[currentIdxRes] = pq.peek().data;
        currentIdxRes++;

        for(int i=K;i<Arr.length;i++){
            while(pq.peek().idx <= i-K && pq.size()>=0){
                pq.remove();
            }
    
            pq.add(new Info(i,Arr[i]));
    
            res[currentIdxRes] = pq.peek().data;
            currentIdxRes++;
        }

        return res;
    }

    public static void main(String args[]){
        // int Arr[] = {1,3,-1,-3,3,5,6,7};
        int Arr[] = {1,-1};

        int res[] = maxSlidingWindow(Arr,1);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
