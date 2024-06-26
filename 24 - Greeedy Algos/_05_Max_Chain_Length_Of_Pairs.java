import java.util.Arrays;
import java.util.Comparator;

public class _05_Max_Chain_Length_Of_Pairs {
    public static void main(String[] args) {
        int pairs[][] ={{5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,90} };

        //Sorting Based On Ending Index
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int maxLength = 1;
        int chairEnd = pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=chairEnd){
                maxLength++;
                chairEnd = pairs[i][1];
            }
        }

        System.out.println(maxLength);
    }
}
