public class _04_Else_If {
    public static void main(String[] args) {
        int Age = 15;

        if(Age >= 18){
            System.out.println("Adult");
        }
        else if(Age >= 13 && Age < 18){
            System.out.println("Teenagers");
        }
        else {
            System.out.println("Child");
        }
    }
}
