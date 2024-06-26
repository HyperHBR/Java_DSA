public class _15_Multiple_Implementations {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName();
        s1.TuitionName();
    }
}

interface Tuition{
    void TuitionName();
}

interface School{
    void SchoolName();
}

class Student implements Tuition,School{
    public void TuitionName(){
        System.out.println("No Tuition Name");
    }
    public void SchoolName(){
        System.out.println("No School Name");
    }
}

