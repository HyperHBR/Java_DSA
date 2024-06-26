import java.util.*;

public class _13_Stack_Using_Deque {
    public static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty(){
            return dq.isEmpty();
        }

        public static void push(int data){
            dq.addLast(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            return dq.removeLast();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            return dq.getLast();
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
