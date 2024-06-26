public class _07_Reverse_Of_A_Number{
    public static void main(String[] args) {
        int Number = 98765432;
        while(Number>0){
            int reminder = Number % 10;
            Number /= 10;
            System.out.print(reminder);
        }
    }
}

/* 
 * Logic : 
 * To Get Last Digit We Will Be Using Modulo 10
 * Now To Remove The Last Digit We Will Divide By 10
 * Till Number Gets 0
*/