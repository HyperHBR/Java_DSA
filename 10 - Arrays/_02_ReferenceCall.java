public class _02_ReferenceCall {

    public static void update(int marks[],int NonChangable){
        NonChangable = 0;
        for(int i=0;i<marks.length;i++){
            marks[i] -= 5;
        }
    }
    public static void main(String[] args) {
        int Marks[] = {98,99,100};
        int NonChangable = 10;
        update(Marks,NonChangable);

        System.out.println(NonChangable);

        for(int i=0;i<Marks.length;i++){
            System.out.println(Marks[i]);
        }
    }
}
