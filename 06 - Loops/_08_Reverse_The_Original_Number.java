public class _08_Reverse_The_Original_Number {
    public static void main(String[] args) {
        int N = 12345;
        int rev = 0;

        while(N>0){
            int Rem =  N % 10;
            rev = (rev*10) + Rem;
            N /= 10;
        }
        System.out.println("Reverse : " + rev);
    }
}

/*
 * Logic:
 * Rev = 0
 * Rev = Rev*10 + LastDigit
 * Last Digit Via Modulo And Division
*/