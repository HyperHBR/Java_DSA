public class _04_CharacterPattern {
    public static void main(String[] args) {
        char c = 'A';
        int Lines = 5;
        for(int i=1;i<=Lines;i++){
            for(int j=1;j<=i;j++,c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
