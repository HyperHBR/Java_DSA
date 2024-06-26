public class _02_Catalan_Number_Recursion {
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int ans = 0; //Cn
        
        for(int i=0;i<n;i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(catalanRec(10));
    }
}
