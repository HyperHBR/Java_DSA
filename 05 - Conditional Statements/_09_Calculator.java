import java.util.*;

public class _09_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int A = scanner.nextInt();
        System.out.println("Enter The Second Number : ");
        int B = scanner.nextInt();

        System.out.println("Enter The Operation You Want (+ - * / %)");
        char Oper = scanner.next().charAt(0);

        switch (Oper) {
            case '+':   System.out.println("Answer = " + (A+B));
                        break;
            case '-':   System.out.println("Answer = " + (A-B));
                        break;
            case '*':   System.out.println("Answer = " + (A*B));
                        break;
            case '/':   System.out.println("Answer = " + (A/B));
                        break;
            case '%':   System.out.println("Answer = " + (A%B));
                        break;
            default:    System.out.println("Invalid Input");
        }
    }
}
