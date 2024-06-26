public class _06_DoublyLL {
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
            size++;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }
    public static void main(String[] args) {
        _06_DoublyLL ll = new _06_DoublyLL();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printll();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.printll();
    }
}
