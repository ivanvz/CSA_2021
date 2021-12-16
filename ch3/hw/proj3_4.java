package ch3.hw;
import java.util.Scanner;
public class proj3_4 {
    public static void main(String args[]){
//            Declarations
            Scanner in = new Scanner(System.in);
            double hourlyWage;
            double totalRegHrs;
            double totalOvertimeHrs;
            double totalWeeklyPay;

//            User inputs
        System.out.print("Input hourly wage: ");
        hourlyWage = in.nextDouble();
        System.out.print("Input total regular hours: ");
        totalRegHrs = in.nextDouble();
        System.out.print("Input total overtime hours: ");
        totalOvertimeHrs = in.nextDouble();

//        Math stuff
        totalWeeklyPay = (hourlyWage * totalRegHrs) + (totalOvertimeHrs * 10 * 1.5);

//        Output
        System.out.println("An employee’s total weekly pay  " + totalWeeklyPay);
    }
}
