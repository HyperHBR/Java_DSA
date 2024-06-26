public class _06_Largest_Of_3 {
    public static void main(String[] args) {
        int A = 5;
        int B = 99;
        int C = 7;

        if((A>=B) && (A>=C)){
            System.out.println("A Is Largest");
        }
        else if(B>=C)
        {
            System.out.println("B Is Largest");
        }
        else
        {
            System.out.println("C Is Largest");
        }
    }
}
