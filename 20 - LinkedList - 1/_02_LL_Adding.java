public class _02_LL_Adding{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int Size;

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        //1 - Creating New Node
        Node newNode = new Node(data);
        Size++;

        //If No Previous Node
        if(head==null){
            head=tail=newNode;
            return;
        }

        //2 - Pointing Next To Head
        newNode.next = head;

        //3 - NewNode To Head
        head = newNode;
    }

    public void addLast(int data){
        //1 - Creating New Node
        Node newNode = new Node(data);
        Size++;

        //If No Previous Node
        if(head==null){
            head=tail=newNode;
            return;
        }

        //2 - Pointing Tail.Next To NewNode
        tail.next = newNode;

        //3 - NewNode To Tail
        tail = newNode;
    }

    public void addAtIndex(int data,int Index){
        //1 - Creating New Node
        Node newNode = new Node(data);
        Size++;
        
        Node temp = head;
        int i = 0;

        //If No Element
        if(Index == 0){
            addFirst(data);
            return;
        }

        //2 - Going To The Location
        while(i < Index-1){
            temp = temp.next;
            i++;
        }

        //3 - Changing Pointers
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public static void main(String[] args) {
        _02_LL_Adding ll = new _02_LL_Adding();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
        ll.addAtIndex(5, 2);
        ll.printLL();
        System.out.println(ll.Size);
    }
}