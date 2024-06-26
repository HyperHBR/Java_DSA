public class _04_LogicalOperators {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        System.out.println("------------AND Operations------------");
        System.out.println("True AND True : " + (A&&A));
        System.out.println("False AND True : " + (B&&A));
        System.out.println("True AND False : " + (A&&B));
        System.out.println("False AND False : " + (B&&B));

        System.out.println("\n------------OR Operations------------");
        System.out.println("True OR True : " + (A||A));
        System.out.println("False OR True : " + (B||A));
        System.out.println("True OR False : " + (A||B));
        System.out.println("False OR False : " + (B||B));

        System.out.println("\n------------NOT Operations------------");
        System.out.println("NOT True : " + (!A));
        System.out.println("NOT False : " + (!B));
    }
}
