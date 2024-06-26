import java.util.*;

public class _07_Sum_Of_Two_Integers_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        int Sum = Num1+Num2;

        System.out.println(Sum);

        sc.close();
    }
}
