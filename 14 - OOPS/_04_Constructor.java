public class _04_Constructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Student s1 = new Student("Hyper",4);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}

class Pen{
    String color;
    int tipSize;

    Pen(){
        System.out.println("Constructor Is Called");
    }
}

class Student{
    String name;
    int rollNo;

    Student(String name,int roll){
        this.name = name;
        this.rollNo = roll;
    }
}