public class _05_ConstructorTypes {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1086);
        // Student s3 = new Student("Hyper"); //Invalid No Such Constructor

        // Pen p1 = new Pen(); //Invalid Since No Such Contructor And Default Constructor Will Not Be Created
    }
}

class Student{
    String name;
    int rollNo;

    Student(){
        System.out.println("Non Param Constructor");
        }
        
    Student(int rollNo){
        System.out.println("Param Constructor");
        this.rollNo = rollNo;
    }
}

class Pen{
    String color;

    Pen(String color){
        System.out.println("Param Constructor");
        this.color = color;
    }
}
