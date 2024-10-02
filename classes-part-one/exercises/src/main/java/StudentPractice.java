import java.util.ArrayList;
import org.launchcode.Student;
import org.launchcode.Teacher;
import org.launchcode.Course;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Richard", 12345, 1, 4.0);
        Student student1 = new Student("Jeff", 23456, 1, 4.0);
        students.add(student);
        students.add(student1);
        Teacher teacher = new Teacher("Shawn", "Coolie", "FullStackWebDevelopment",6);
        Course course = new Course("FullStackWebDevelopment", teacher, students);
    }
}
