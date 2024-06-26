import java.util.*;

public class _06_Inputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For Single Word(Till Space)
        //String Name = sc.next();
        //System.out.println(Name);
        
        // For Whole Line
        String FullName = sc.nextLine();
        System.out.println(FullName);

        sc.close();
    }
}
