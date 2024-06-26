public class _09_Multi_Level_Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.getBloodTempurature();
        d1.bark();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Mammal extends Animal{
    void getBloodTempurature(){
        System.out.println("Warm Blooded");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Barks");
    }
}
