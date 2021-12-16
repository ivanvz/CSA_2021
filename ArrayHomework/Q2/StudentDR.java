package ArrayHomework.Q2;
import java.util.ArrayList;
public class StudentDR {
    public static void main (String[] args)
    {
        ArrayList<Student> student = new ArrayList<>();

        Student one = new Student("Arthur", "Dent", 4374, 9,96, 97, 98);
        Student two = new Student("Ford", "Prefect", 2387, 11, 87, 98, 99);
        Student three = new Student("Zaphod", "Beeblebrox", 2394, 10,33, 79, 42);

        student.add(one);
        student.add(two);
        student.add(three);

        for (Student count : student)
            System.out.println(count);
    }
}