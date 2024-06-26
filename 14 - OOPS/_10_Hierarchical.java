public class _10_Hierarchical {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        s1.getSchoolName();
        t1.getSchoolName();
        s1.getRoleType();
        t1.getRoleType();
    }
}

class School{
    void getSchoolName(){
        System.out.println("SJS");
    }
}

class Teacher extends School{
    void getRoleType(){
        System.out.println("Teacher");
    }
}

class Student extends School{
    void getRoleType(){
        System.out.println("Student");
    }
}
