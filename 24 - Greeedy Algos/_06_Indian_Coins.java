import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _06_Indian_Coins {
    public static void main(String[] args) {
        Integer denominations[] = {1,2,5,10,20,50,100,500,2000};
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(denominations,Comparator.reverseOrder());

        int i=0;
        int totalCoins = 0;
        int Value = 98;
        
        while(true){
            if(denominations[i]<=Value){
                Value -= denominations[i];
                totalCoins++;
                ans.add(denominations[i]);
                if(Value == 0){
                    break;
                }
            }
            else{
                i++;
            }
        }

        System.out.println(totalCoins);

        System.out.println(ans);
    }
}
