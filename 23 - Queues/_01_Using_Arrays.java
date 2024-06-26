public class _01_Using_Arrays{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        public Queue(int size){
            this.arr = new int[size];
            this.size = size;
            this.rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue Is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return Integer.MIN_VALUE;
            }
            int val = arr[0];

            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;

            return val;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); //Queue Full Error

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}