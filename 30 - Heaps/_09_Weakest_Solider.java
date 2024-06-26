import java.util.*;

public class _09_Weakest_Solider{
    public static class RowInfo implements Comparable<RowInfo>{
        int idx;
        int soliderCount;
        String name;

        
        static int count = 0;
        
        public RowInfo(int idx, int soliderCount) {
            this.idx = idx;
            this.soliderCount = soliderCount;
            this.name = "Row : " + count;
            count++;
        }

        @Override
        public int compareTo(RowInfo R) {
            if(this.soliderCount == R.soliderCount){
                return this.idx - R.idx;
            }else{
                return this.soliderCount-R.soliderCount;
            }
        }


    }

    public static void main(String[] args) {
        int Arr[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0},
        };

        int K=2;

        PriorityQueue<RowInfo> pq = new PriorityQueue<>();

        for(int i=0;i<Arr.length;i++){
            int count = 0;  
            for(int j=0;j<Arr[0].length;j++){
                count += Arr[i][j]==1 ? 1 : 0;
            }
            pq.add(new RowInfo(i,count));
        }

        while(K>0 && !pq.isEmpty()){
            System.out.println(pq.peek().name);
            pq.remove();
            K--;
        }
    }
}