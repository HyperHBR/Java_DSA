import java.util.*;

public class _04_First_N_Natural_Number_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Sum = 0;
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        int i = 1;
        while(i<=N){
            Sum += i;
            i++;
        }
        System.out.println("Sum = " + Sum);
        sc.close();
    }
}
