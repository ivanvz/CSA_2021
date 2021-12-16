package Ch6.Labs.EmployeeData;
import java.util.Scanner;
public class EmployeeDataDR {
    public static void main(String[] args){
        int id;
        String firstName;
        String lastName;
        int monthlySalary;
        int bonusSalary;
        double raisePercent;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your ID Number: ");
        id = scn.nextInt();

        scn.nextLine();

        System.out.println("Enter your first name: ");
        firstName = scn.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scn.nextLine();

        System.out.println("Enter your current monthly Salary: ");
        monthlySalary = scn.nextInt();

        System.out.println("Enter bonus received: ");
        bonusSalary = scn.nextInt();

        System.out.println("Enter expected raise percent: ");
        raisePercent = scn.nextDouble();

        EmployeeData DataOutput = new EmployeeData(id, firstName, lastName, monthlySalary, bonusSalary, raisePercent);
        System.out.println(DataOutput);
    }
}
