import java.util.*;

public class _01_Using_JCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(5);
        pq1.add(2);
        pq1.add(1);
        pq1.add(7);
        pq1.add(3);

        pq2.add(5);
        pq2.add(2);
        pq2.add(1);
        pq2.add(7);
        pq2.add(3);

        while(!pq1.isEmpty()){
            System.out.print(pq1.remove() + " ");
        }

        System.out.println();

        while(!pq2.isEmpty()){
            System.out.print(pq2.remove() + " ");
        }
    }
}