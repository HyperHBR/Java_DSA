import java.util.LinkedList;

public class _03_LL_From_JCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        //To Add
        ll.addFirst(5);
        ll.addLast(6);
        ll.addFirst(7);
        ll.add(5); //By Default At Last

        //To Print
        System.out.println(ll);
        
        //To Remove
        ll.removeFirst();
        ll.removeLast();
        ll.remove(); //By Default At First
        System.out.println(ll);
    }
}
