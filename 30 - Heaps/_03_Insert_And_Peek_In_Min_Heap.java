import java.util.ArrayList;

public class _03_Insert_And_Peek_In_Min_Heap {
    public static class Heap{
        ArrayList<Integer> al = new ArrayList<>();

        public int peek(){
            return al.get(0);
        }

        public void insert(int data){
            // Adding At The Last
            al.add(data);
            
            //Index Of New Node
            int x = al.size()-1;
            //Index Of New Node Parent
            int par = (x-1)/2;

            while(x > 0 && al.get(x) < al.get(par)){
                //Swap
                int temp = al.get(x);
                al.set(x, al.get(par));
                al.set(par, temp);

                //Updating
                x = par;
                par = (x - 1) / 2;
            }
        }
    }
}
