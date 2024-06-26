import java.util.*;

public class _09_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float PI = 3.14f;
        float Radius = sc.nextFloat();

        float Area = PI*Radius*Radius;
        System.out.println(Area);
        sc.close();
    }
}
