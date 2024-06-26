import java.util.*;

public class _02_Largest_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number :");
        int A = sc.nextInt();
        System.out.println("Enter The Second Number :");
        int B = sc.nextInt();

        if(A>=B){
            System.out.println("First Number Is Largest Of Two");
        } else {
            System.out.println("Second Number Is Largest Of Two");
        }

        sc.close();
    }
}
