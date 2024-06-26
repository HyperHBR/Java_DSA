public class _12_MethodOverridding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Deer d1 = new Deer();

        a1.eats();
        d1.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}