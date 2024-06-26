public class _06_BinomialCoeff {

    public static int calcFact(int Num){
        int Fact = 1;
        while(Num>1){
            Fact *= Num;
            Num--;
        }
        return Fact;
    }

    public static int BinomialCoeff(int N,int R){
        /*
         * nCr =   n!
         *      r!(n-r)!
         */
        int NFac = calcFact(N);
        int RFac = calcFact(R);
        int NMRFac = calcFact(N-R);

        return NFac/(RFac*NMRFac);
    }

    public static void main(String[] args) {
        int N = 5;
        int R = 2;
        System.out.println(BinomialCoeff(N, R));
    }
}
