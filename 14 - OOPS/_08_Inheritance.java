public class _08_Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }    
}

class Animal{
    String animalType;

    void eat(){
        System.out.println("Eating In Progress");
    }
}

class Dog extends Animal{
    String dogBreed;

    void bark(){
        System.out.println("Dog Is Barking");
    }
}