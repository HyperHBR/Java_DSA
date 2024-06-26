import java.util.*;

public class _08_Stack_Using_Queues_Push_N {
    public static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
            else{
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            if(!q1.isEmpty()){
                return q1.remove();
            }
            else{
                return q2.remove();
            }
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            if(!q1.isEmpty()){
                return q1.peek();
            }
            else{
                return q2.peek();
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
