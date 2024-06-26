public class _03_CallBy {
    public static void ChangeA(int a){
        a = 100;
    }
    public static void main(String[] args) {
        int a = 5;
        ChangeA(a);
        System.out.println(a);
    }
}
