import java.util.PriorityQueue;

public class _08_Connecting_N_Ropes {
    public static void main(String[] args) {
        int Arr[] = {2,3,3,4,6};
        int minCost = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<Arr.length;i++){
            pq.add(Arr[i]);
        }

        while(pq.size()>1){
            int r1 = pq.remove();
            int r2 = pq.remove();

            minCost += r1+r2;

            pq.add(r1+r2);
        }

        System.out.println(minCost);
    }
}
