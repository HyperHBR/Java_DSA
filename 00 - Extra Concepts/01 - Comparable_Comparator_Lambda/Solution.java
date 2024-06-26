import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    public int marks;
    public String name;

    public Student(int marks,String name){
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

public class Solution{
    public static void main(String[] args) {
        Student s3 = new Student(120, "DVP");
        Student s1 = new Student(100, "Hyper");
        Student s2 = new Student(104, "Nik");

        Student s[] = {s1,s2,s3};

        Arrays.sort(s);
        
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].name + " " + s[i].marks);
        }
        
        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.marks, s2.marks);
            }
        });

        System.out.println();

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].name + " " + s[i].marks);
        }
    }
}
