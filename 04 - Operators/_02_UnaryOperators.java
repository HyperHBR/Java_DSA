public class _02_UnaryOperators 
{
    public static void main(String[] args) {
        int A = 5;
        System.out.println("Initial Value Of A = 5");

        //Post Increment
        System.out.println("---------Post Increment---------");
        int B = A++;
        System.out.println("Value Of A : " + A);
        System.out.println("Value Of B : " + B);

        //Pre Increment
        A = 5;
        System.out.println("---------Pre Increment---------");
        B = ++A;
        System.out.println("Value Of A : " + A);
        System.out.println("Value Of B : " + B);

        //Post Increment
        A = 5;
        System.out.println("---------Post Decrement---------");
        B = A--;
        System.out.println("Value Of A : " + A);
        System.out.println("Value Of B : " + B);

        //Post Increment
        A = 5;
        System.out.println("---------Pre Decrement---------");
        B = --A;
        System.out.println("Value Of A : " + A);
        System.out.println("Value Of B : " + B);
    }
}
