public class _07_Function_Overloading {
    public static int Sum(int a,int b){
        return a+b;
    }
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
    public static float Sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,3));
        System.out.println(Sum(1.2f,1.2f));
    }
}
