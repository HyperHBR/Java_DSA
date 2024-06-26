import java.util.*;

public class _07_Stack_Using_Queues_Pop_N {
    public static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            int top = -1;
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    //Removing Last Element Of Que
                    top = q1.remove();
                    //If Last Element Was The Only One Remaining
                    if(q1.isEmpty()){
                        break;
                    }
                    //If Not Add It To Next One
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    //Removing Last Element Of Que
                    top = q2.remove();
                    //If Last Element Was The Only One Remaining
                    if(q2.isEmpty()){
                        break;
                    }
                    //If Not Add It To Next One
                    q1.add(top);
                }
            }

            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack Is Empty");
                return Integer.MIN_VALUE;
            }

            int top = -1;
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    //Removing Last Element Of Que
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    //Removing Last Element Of Que
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
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
