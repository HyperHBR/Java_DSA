public class _08_Compare {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");

        if(s1==s2){
            System.out.println("Equals");
            }
        else{
            System.out.println("Not Equals");
        }

        if(s1==s3){
            System.out.println("Equals");
            }
        else{
            System.out.println("Not Equals");
        }

        if(s1.equals(s3)){
            System.out.println("Equals");
            }
        else{
            System.out.println("Not Equals");
        }
    }
}
