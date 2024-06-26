public class _05_ZigZag{
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

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    //Finding Mid
    public Node findMid(){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void ZigZag(){
        //Finding Mid
        Node midNode = findMid();
        Node rightHead = midNode.next;
        midNode.next = null;

        //Reversing Second Half
        Node prev = null;
        Node curr = rightHead;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        rightHead = prev;

        //Joining Approach
        Node leftHead = head;
        Node NextL,NextR;

        while(rightHead!=null && leftHead!=null){
            NextL = leftHead.next;
            leftHead.next = rightHead;
            NextR = rightHead.next;
            rightHead.next = NextL;
            rightHead = NextR;
            leftHead = NextL;
        } 
    }

    public static void main(String[] args) {
        _05_ZigZag ll = new _05_ZigZag();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printLL();
        
        ll.ZigZag();
        ll.printLL();
    }

}