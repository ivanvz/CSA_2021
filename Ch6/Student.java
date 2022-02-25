package src.Ch6;

public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress , workAddress;
    String name;
    int test1,test2,test3;
    //-----------------------------------------------------------------
// Sets up this Student object with the specified initial values.
//-----------------------------------------------------------------
    public Student ( String first, String last, Address home,Address work,Address school )
    {
        firstName =first;
        lastName = last;
        homeAddress = home;
        workAddress = work;
        schoolAddress = school;
        test1 = 80;
        test2 = 70;
        test3 = 60;
    }

    public Student ( String first, String last, Address home,Address school )
    {
        firstName =first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public Student ( String first, String last )
    {
        firstName =first;
        lastName = last;

    }

    public void inputGrades()
    {
        System.out.print("Enter " + name + "'s score for test 1: ");
        test1 = Keyboard.readInt();
        while (test1 < 0 || test1 > 100)
        {
            System.out.println (test1 + " is not a valid test grade.");
            System.out.print ("Enter a grade in the 0 - 100 range: ");
            test1 = Keyboard.readInt();
        }

        System.out.print("Enter " + name + "'s score for test 2: ");
        test2 = Keyboard.readInt();
        while (test2 < 0 || test2 > 100)
        {
            System.out.println (test2 + " is not a valid test grade.");
            System.out.print ("Enter a grade in the 0 - 100 range: ");
            test2 = Keyboard.readInt();
        }

    }

    public double getAverage()
    {
        return (double)(test1 + test2 + test3)/3;
    }


    //-----------------------------------------------------------------
// Returns this Student object as a string.
//-----------------------------------------------------------------
    public String toString()
    {
        String result;
        result = firstName +"\n";
        result += lastName+"\n" ;
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Work Address:\n" + workAddress;
        result += "Test 1: " + test1 + " Test 2: " + test2 + " Test 3: " + test3;
        return result;
    }
}