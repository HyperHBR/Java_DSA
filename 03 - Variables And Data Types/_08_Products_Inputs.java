import java.util.*;

public class _08_Products_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        int Product = Num1*Num2;

        System.out.println(Product);

        sc.close();
    }
}
