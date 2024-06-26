import java.util.*;

public class _03_1_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Till Which You Want To Print : ");
        int Range = sc.nextInt();
        int Counter = 1;

        while(Counter<=Range){
            System.out.println(Counter);
            Counter++;
        }

        sc.close();
    }
}
