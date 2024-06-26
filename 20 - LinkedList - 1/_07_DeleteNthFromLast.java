public class _07_DeleteNthFromLast{
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

    public int removeFirst(){
        if(Size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(Size==1){
            int val = head.data;
            head = tail = null;
            Size = 0;
            return val;
        }
        else{
            int val = head.data;
            head = head.next;
            Size--;
            return val;
        }
    }

    public int removeLast(){
        if(Size==0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(Size==1){
            int val = head.data;
            head = tail = null;
            Size = 0;
            return val;
        }

        Node prev = head;

        for(int i=0;i<Size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data; // Tail.data
        prev.next = null;
        tail = prev;
        Size--;
        return val;
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void DeleteLastNth(int index){
        //Calculating Size Manually
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        
        int i = 1; //Starting 1st
        int idxToFind = size - index;

        if(index==size){
            removeFirst();
            return;
        }

        Node prev = head;

        while(i<idxToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        _07_DeleteNthFromLast ll = new _07_DeleteNthFromLast();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
        ll.DeleteLastNth(4);
        ll.printLL();
    }
}