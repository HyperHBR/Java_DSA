import java.util.*;

public class _12_Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Nmber You Want To Check : ");
        int N = sc.nextInt();
        boolean isPrime = true; //Assuming The Number Is Prime

        if (N==2) {
            System.out.println("Prime Number");
        } else {
            for(int i=2;i<=Math.sqrt(N);i++){
                if(N%i==0){
                    isPrime = false;
                }
            }
    
            if(isPrime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Composite Number");
            }
        }
    }
}

/*
    * Logic :  
    * If Number Is Not Prime That It Will Be Divisible By A Number B/W 2 To N-1
    * So Check Number % (IntermediateValues) == 0 Or Not
    * For Better Complexity We Can Find Till N/2 Only Cause After It The Multiples Will Repeat
        * E.G. 12 = 1 X 12
        *           2 X 6  
        *           3 X 4  
        * ----------------------------
        *           4 X 3  
        *           6 X 2  
        *           12 X 1  
    * For Even Better Complexity We Can Find Till SQRT(N) Since N = _/N * _/N
        * So If One Increases Other Decreases
*/