public class _03_Getter_Setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        //Trying To Set
        p1.setColor("Blue");
        // p1.Color = "Red"; //Invalid
        p1.setTipSize(5);
        // p1.tipSize = 6; //Invalid

        //Trying To Access
        System.out.println(p1.getColor());
        //System.out.println(p1.Color); //Invalid
        System.out.println(p1.getTipSize());
        //System.out.println(p1.tipSize); //Invalid
    }
}

class Pen{
    private String Color;
    private int tipSize;

    //Getters
    String getColor(){
        return this.Color;
    }

    int getTipSize(){
        return this.tipSize;
    }


    //Setters
    void setColor(String Color){
        this.Color = Color;
    }

    void setTipSize(int Size){
        this.tipSize = Size;
    }
}
