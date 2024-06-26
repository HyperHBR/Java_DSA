public class _01_LL_Creation{
    public static class Node{
        //Class Is Static So It Can Be Access Directly Via Outer Class Name
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        _01_LL_Creation ll = new _01_LL_Creation();
        ll.head = new Node(0);
        ll.head.next = new Node(1);
    }
}

/*
No Reference to Outer Class:
A static nested class does not have a reference to an instance of the outer class. This is beneficial if the Node class does not need to access any members (fields or methods) of the outer class (_01_LL_Creation). In a typical linked list implementation, a Node represents an element in the list and does not need to access the outer class's members.

Memory Efficiency:
Since the static nested class does not hold an implicit reference to the outer class, it can help reduce memory overhead. This is particularly useful for data structures that may create many instances of the nested class (like nodes in a linked list).

Logical Grouping:
Declaring the Node class inside the linked list class (_01_LL_Creation) groups it logically with the linked list. Making it static indicates that it is a helper class and does not require an outer class instance to function.

Reusability:
A static nested class can be instantiated without an instance of the outer class. This can sometimes make the nested class more reusable in different contexts.

 */