import java.util.PriorityQueue;

public class _02_PQ_With_Classes {
    public static class Student implements Comparable<Student>{

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(); //(Comparator.reverseOrder());

        pq.add(new Student("Hardiksinh", 128));
        pq.add(new Student("Nik", 127));
        pq.add(new Student("Dhyan", 260));
        pq.add(new Student("Vedant", 117));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " : " + pq.peek().rank);
            pq.remove();
        }
    }
}
