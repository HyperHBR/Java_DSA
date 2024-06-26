import java.util.*;

public class _10_Keep_Entering_Untill_MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The Number : ");
            int num = sc.nextInt();
            if (num%10==0) {
                break;
            }
        }
        sc.close();
    }
}
