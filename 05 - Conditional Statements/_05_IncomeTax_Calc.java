import java.util.*;

public class _05_IncomeTax_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income : ");
        int Income = sc.nextInt();

        if(Income<500000){
            System.out.println("Zero Rs Tax");
        }
        else if(Income>=500000 && Income <1000000){
            System.out.println("Tax = " + (int)(Income*0.2));
        }
        else{
            System.out.println("Tax = " + (int)(Income*0.3));
        }

        sc.close();
    }
}
