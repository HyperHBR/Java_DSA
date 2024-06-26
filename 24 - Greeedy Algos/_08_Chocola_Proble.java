import java.util.ArrayList;
import java.util.Collections;

public class _08_Chocola_Proble {
    public static void MinCostChocola(ArrayList<Integer> HCost,ArrayList<Integer> VCost){
        Collections.sort(HCost,Collections.reverseOrder());
        Collections.sort(VCost,Collections.reverseOrder());

        int TotalHPieces = 1;
        int TotalVPieces = 1;

        int HPointer = 0;
        int VPointer = 0;

        int Cost = 0;
        int MoveCounter = 1;


        while(HPointer < HCost.size() && VPointer < VCost.size()){
            if(HCost.get(HPointer) > VCost.get(VPointer)){
                Cost += HCost.get(HPointer)*TotalVPieces;
                TotalHPieces++;
                HPointer++;
            }
            else{
                Cost += VCost.get(VPointer)*TotalHPieces;
                TotalVPieces++;
                VPointer++;
            }
        }

        while(HPointer<HCost.size()){
            Cost += HCost.get(HPointer)*TotalVPieces;
            TotalHPieces++;
            HPointer++;
        }
        while(VPointer<VCost.size()){
            Cost += VCost.get(VPointer)*TotalHPieces;
            TotalVPieces++;
            VPointer++;
        }

        System.out.println(Cost);
    }
    public static void main(String[] args) {
        ArrayList<Integer> HorizontalCost = new ArrayList<>();
        HorizontalCost.add(4);
        HorizontalCost.add(1);
        HorizontalCost.add(2);
        
        ArrayList<Integer> VerticalCost = new ArrayList<>();
        VerticalCost.add(2);
        VerticalCost.add(1);
        VerticalCost.add(3);
        VerticalCost.add(1);
        VerticalCost.add(4);
        
        MinCostChocola(HorizontalCost, VerticalCost);
    }
}

//SPOJ