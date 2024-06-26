public class _06_Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Hyper");
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);

        s1.marks[0]=40;

        System.out.println(s2.name);
        System.out.println(s2.marks[0]); //Here We Are Getting New Value That We Changed After Copy
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);
    }
}

class Student{
    String name;
    int marks[] = new int [3];

    Student(String name){
        this.name = name;
    }

    //Shallow Copy Constructor
    Student(Student s){
        this.name = s.name;
        this.marks = s.marks;
    }
}
