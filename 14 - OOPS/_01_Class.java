public class _01_Class {
    public static void main(String[] args) {
        //Creating An Object Of Class
        Pen p1 = new Pen();

        //Setting Value
        p1.setColor("Red");
        p1.setTipSize(5);

        //Printing Values
        System.out.println(p1.Color);
        System.out.println(p1.tipSize);
        
        //Also
        p1.Color = "Blue";
        System.out.println(p1.Color);
    }
}

class Pen{
    String Color;
    int tipSize;

    void setColor(String Color){
        this.Color = Color;
    }

    void setTipSize(int Size){
        this.tipSize = Size;
    }
}
