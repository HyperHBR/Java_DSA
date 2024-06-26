import java.util.*;

public class _05_Using_Stack_PopN {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public static void add(int data){
            s1.push(data);
        }

        //Remove
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return Integer.MIN_VALUE;
            }
            
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int data = s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return data;
        }

        //Peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return Integer.MIN_VALUE;
            }
            
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int data = s2.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return data;
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
