public class _07_Ternary_Operator {
    public static void main(String[] args) {
        int A = 50;
        int B = 10;
        
        char Largest = (A>=B) ? 'A' : 'B';
        System.out.println("Largest Is : " + Largest);
        
        int C = 50;
        String type = (C%2==0) ? "Even" : "Odd";
        System.out.println("Number Is : " + type);


    }
}
