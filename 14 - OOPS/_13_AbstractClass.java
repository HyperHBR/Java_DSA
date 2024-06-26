public class _13_AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eats();
        h1.walk();
    }
}

abstract class Animal{
    String color;

    //Abstract Class Construtor For Default Values
    Animal(){
        System.out.println("Abstract Class Constructor Called");
        this.color = "Blue";
    }

    void eats(){
        System.out.println("Animal Is Eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walking On Four Legs");
    }
}