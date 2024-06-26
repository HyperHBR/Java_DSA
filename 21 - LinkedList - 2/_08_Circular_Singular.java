public class _08_Circular_Singular {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Adding At First
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            size++;
            head = tail = newNode;
            newNode.next = newNode;
            return;
        }
        size++;
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    //Adding At Last
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            size++;
            head = tail = newNode;
            newNode.next = newNode;
            return;
        }
        size++;
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    //Removing At First
    public int removeFirst(){
        if(size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;

        int val = head.data;
        head = head.next;
        tail.next = head;

        return val;
    }

    //Removing At Last
    public int removeLast(){
        if(size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;

        int val = tail.data;

        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp;

        return val;
    }

    //Printing LL
    public void printLL(){
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        _08_Circular_Singular ll = new _08_Circular_Singular();
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.removeFirst();
        ll.removeLast();
        ll.printLL();
    }
}
