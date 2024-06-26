import java.util.PriorityQueue;

public class _07_Nearby_Cars {

    public static class Car implements Comparable<Car>{
        int xCord;
        int yCord;
        String name;
        int distanceToOriginSq;

        static Integer count = 0;

        public Car(int xCord, int yCord) {
            this.xCord = xCord;
            this.yCord = yCord;
            this.name = "C" + count;
            this.distanceToOriginSq = xCord*xCord + yCord*yCord;
            count++;
        }
        @Override
        public int compareTo(Car c2){
            return (int)(this.distanceToOriginSq - c2.distanceToOriginSq);
        }
    }
    public static void main(String[] args) {
        int carLocation[][] = {
            {3,3},
            {5,-1},
            {-2,4},
        };

        int K=5;

        PriorityQueue<Car> pq =new PriorityQueue<>();

        for(int i=0;i<carLocation.length;i++){
            pq.add(new Car(carLocation[i][0], carLocation[i][1]));
        }

        while(K>0 && !pq.isEmpty()){
            System.out.println(pq.peek().name + " : " + pq.peek().distanceToOriginSq);
            pq.remove();
            K--;
        }
    }
}
