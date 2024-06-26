public class _02_Remove_Cycle{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static boolean doesCycleExist(){
        //Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                cycle = true;
                break;
            }
        }
        
        slow = head;
        Node prev = null;
        
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        prev.next = null;
        

        return;
    }

    public static void main(String[] args) {
        // Issue Here We Are Connecting To Head
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        temp.next = new Node(3);
        temp.next.next = temp;

        System.out.println(doesCycleExist());
        removeCycle();
        System.out.println(doesCycleExist());
    }
}