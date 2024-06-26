import java.util.*;

public class _04_LargestSmallest {

    public static void LargestSmallestSearch(int Numbers[]){

        int largest = Integer.MIN_VALUE; //-Infinity
        int smallest = Integer.MAX_VALUE; //+Infinity

        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]>largest){
                largest = Numbers[i];
            }
        }

        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]<smallest){
                smallest = Numbers[i];
            }
        }

        System.out.println("Smallest : " + smallest);
        System.out.println("Largest : " + largest);
    }
    public static void main(String[] args) {
        int Numbers[] = {100,65,76,45,65,77,34,87,96,87,98,45};
        LargestSmallestSearch(Numbers);
    }
}
