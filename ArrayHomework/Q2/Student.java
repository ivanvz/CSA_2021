package ArrayHomework.Q2;
public class Student {
    String firstName, lastName;
    int ID, grade;

    double Test1, Test2, Test3;

    public Student (String first, String last, int id, int gradeLevel,
                   double test1, double test2, double test3){
//        Student Profile
        firstName = first;
        lastName = last;
        ID = id;
        grade = gradeLevel;

//        Test Grades
        Test1 = test1;
        Test2 = test2;
        Test3 = test3;
    }


    public String toString ()
    {
        String StudentName;
        StudentName = "Name: " + firstName + " " + lastName + " |";
        double total = 0, result = 0, average = 3;

        total = Test1 + Test2 + Test3;
        result = total / average;
        return StudentName + " ID: " + ID + " |" + " Grade Level: " + grade + "\n---------Grades---------" +
                "\n First Test Score: " + Test1 + "\n Second Test Score: " + Test2 +
                "\n Third Test Score: " + Test3 + "\n Test Average: " + result + "\n";

    }
}
