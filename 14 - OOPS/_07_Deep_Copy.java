public class _07_Deep_Copy{
    public static void main(String[] args) {
        Student s1 = new Student("Hyper");
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);

        s1.marks[0]=40;

        System.out.println(s2.name);
        System.out.println(s2.marks[0]); //Here We Are Getting Old Value
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

    //Deep Copy Constructor
    Student(Student s){
        this.name = s.name;
        for(int i=0;i<marks.length;i++){
            marks[i] = s.marks[i];
        }
    }
}
