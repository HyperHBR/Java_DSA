public class _04_Merge_Sort{
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
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //MergeSort
    public Node MergeSort(Node head){
        //Base
        if(head==null || head.next==null){
            return head;
        }

        //Finding Mid
        Node mid = findMid(head);

        //Left And Right
        Node rightHead = mid.next;
        mid.next = null;
        Node Left = MergeSort(head);
        Node Right = MergeSort(rightHead);

        //Merge
        return Merge(Left,Right);
    }

    //Merge
    public Node Merge(Node LeftHead,Node RightHead){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(LeftHead!=null && RightHead!=null){
            if(LeftHead.data<RightHead.data){
                temp.next = LeftHead;
                LeftHead = LeftHead.next;
                temp = temp.next;
            }
            else{
                temp.next = RightHead;
                RightHead = RightHead.next;
                temp = temp.next;
            }
        }

        while(LeftHead!=null){
            temp.next = LeftHead;
            LeftHead = LeftHead.next;
            temp = temp.next;
        }
        while(RightHead!=null){
            temp.next = RightHead;
            RightHead = RightHead.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }


    public static void main(String[] args) {
        _04_Merge_Sort ll = new _04_Merge_Sort();

        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(7);
        ll.addLast(9);
        ll.addLast(100);
        ll.addLast(19);

        ll.printLL();

        head =ll.MergeSort(head);

        ll.printLL();
    }

}