public class _02_Circular_Using_Arrays{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int size){
            this.arr = new int[size];
            this.size = size;
            this.rear = -1;
            this.front = -1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return rear+1%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Is Full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return Integer.MIN_VALUE;
            }
            int val = arr[front];

            if(rear == front){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }

            return val;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);

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