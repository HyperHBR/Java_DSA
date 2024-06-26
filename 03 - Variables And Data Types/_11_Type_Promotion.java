public class _11_Type_Promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        System.out.println(a);
        System.out.println(b);
        System.out.println(b-a);

        // byte BT = a + b; ---> Error / Lossy Conversion

        int p = 10;
        long q = 14;
        float r = 12.23f;
        double s = 3.14;

        //Why No Error?
        float X = q;

        double ANS = p+q+r+s;
        System.out.println(ANS);
    }   
}
