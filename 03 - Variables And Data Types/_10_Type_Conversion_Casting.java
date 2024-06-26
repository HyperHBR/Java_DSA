import java.util.*;

public class _10_Type_Conversion_Casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Type Conversion
        byte a = 8;
        short b = 10;
        char c = 'c';
        int d = 99;
        float e = 23.45f;
        long f = 10000;
        double g = 3.14;

        // byte h = b/c/d/e/f/g; -- Invalid
        // short h = c/d/e/f/g; -- Invalid ....

        //Type Casting
        int h = (int)e;
        System.out.println(h);

        char i = (char)d;
        System.out.println(i);

        sc.close();
    }
}
