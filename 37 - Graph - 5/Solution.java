class Solution {
    public static void plusOne(int[] digits) {
        int Num = 0;
        int newSize = 0;

        for(int i=0;i<digits.length;i++){
            Num *= 10;
            Num += digits[i];
        }

        Num+=1;
        int temp = Num;

        while(temp>0){
            temp/=10;
            newSize++;
        }

        int Arr[] = new int[newSize];
        int idx = newSize-1;;

        while(Num>0){
            int rem = Num%10;
            Num/=10;
            
            Arr[idx--] = rem;
        }

        //return Arr;
    }
    
    public static void main(String[] args) {
        int ABC[] = {9,8,7,6,5,4,3,2,1};
        plusOne(ABC);

    }
}