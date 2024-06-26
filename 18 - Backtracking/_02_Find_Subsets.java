public class _02_Find_Subsets {
    public static void FindSubsets(String str,String subSet,int i){
        //BaseCase
        if(i==str.length()){
            if(subSet.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(subSet);
            }
            return;
        }
        //Ahiya Darek String Navi Banshe Cause Strings Are Immutable
        //CurrentCharIncluded
        FindSubsets(str, subSet + str.charAt(i), i+1);
        //CurrentCharExcluded
        FindSubsets(str, subSet, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str,"",0);
    }
}
