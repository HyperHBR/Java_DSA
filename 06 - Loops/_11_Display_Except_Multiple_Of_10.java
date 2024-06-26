import java.util.*;

public class _11_Display_Except_Multiple_Of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The Number : ");
            int Num = sc.nextInt();
            if(Num%10==0){
                continue;
            }
            System.out.println(Num);
        }
    }
}
