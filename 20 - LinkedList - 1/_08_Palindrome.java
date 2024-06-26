public class _08_Palindrome {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    
    //Print
    public void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    //Add At First
    public void AddFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add At First
    public void AddLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public Node findMid(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;            
        }
        return slow;
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        // S1 = Finding Mid
        Node midNode = findMid();

        // S2 = Reverse Second Half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHead = prev;
        Node leftHead = head;

        // S3 = Checking
        while(rightHead != null){
            if(rightHead.data != leftHead.data){
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _08_Palindrome ll = new _08_Palindrome();
        ll.AddFirst(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(3);
        ll.AddLast(1);
        ll.printLL();
        System.out.println(ll.isPalindrome());
    }
}