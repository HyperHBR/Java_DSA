public class _08_Prime_Or_Not {
    public static void CheckPrime(int Num){
        boolean isPrime = true;

        if(Num==2){
            System.out.println(Num + " Is Prime");
        }

        for(int i=2;i<Num;i++){
            if(Num%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(Num + " Is Prime");
        } else {
            System.out.println(Num + " Is Not Prime");
        }
    }
    public static void main(String[] args) {
        CheckPrime(5);
    }
}

/* Optimized Soln

public class _08_Prime_Or_Not {
    public static void CheckPrime(int Num){
        boolean isPrime = true;

        if(Num==2){
            System.out.println(Num + " Is Prime");
        }

        for(int i=2;i<=Math.sqrt(Num);i++){
            if(Num%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(Num + " Is Prime");
        } else {
            System.out.println(Num + " Is Not Prime");
        }
    }
    public static void main(String[] args) {
        CheckPrime(5);
    }
}

*/
