public class _11_MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2,3));
        System.out.println(c.sum((float)1.5,(float)2.5,(float)3.5));
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b,float c){
        return a+b+c;
    }
}
