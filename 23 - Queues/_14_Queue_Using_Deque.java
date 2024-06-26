import java.util.Deque;
import java.util.LinkedList;

public class _14_Queue_Using_Deque {
      public static class Queue{
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty(){
            return dq.isEmpty();
        }

        public static void add(int data){
            dq.addLast(data);
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return Integer.MIN_VALUE;
            }

            return dq.removeFirst();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
