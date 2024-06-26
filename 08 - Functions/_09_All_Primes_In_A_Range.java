public class _09_All_Primes_In_A_Range {

    public static boolean CheckPrime(int Num){
        if(Num==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(Num);i++){
            if(Num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int Min,int Max){
        for(int i=Min;i<=Max;i++){
            if(CheckPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrimesInRange(2,100);
    }
}
