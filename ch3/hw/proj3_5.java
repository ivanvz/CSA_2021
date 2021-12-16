package ch3.hw;
import java.util.Scanner;
public class proj3_5 {
    public static void main(String args[]){
//            Declarations
        Scanner in = new Scanner(System.in);
        double hourlyWage;
        double MtotalRegHrs;
        double MtotalOvertimeHrs;
        double MtotalWeeklyPay;
        double TtotalRegHrs;
        double TtotalOvertimeHrs;
        double TtotalWeeklyPay;
        double WtotalRegHrs;
        double WtotalOvertimeHrs;
        double WtotalWeeklyPay;
        double ThurtotalRegHrs;
        double ThurtotalOvertimeHrs;
        double ThurtotalWeeklyPay;
        double FritotalRegHrs;
        double FritotalOvertimeHrs;
        double FritotalWeeklyPay;

//            User inputs
        System.out.print("Input hourly wage: ");
        hourlyWage = in.nextDouble();

        System.out.print("Input Monday total regular hours: ");
        MtotalRegHrs = in.nextDouble();
        System.out.print("Input Monday total overtime hours: ");
        MtotalOvertimeHrs = in.nextDouble();

        System.out.print("Input Tuesday total regular hours: ");
        TtotalRegHrs = in.nextDouble();
        System.out.print("Input Tuesday total overtime hours: ");
        TtotalOvertimeHrs = in.nextDouble();

        System.out.print("Input Wednesday total regular hours: ");
        WtotalRegHrs = in.nextDouble();
        System.out.print("Input Wednesday total overtime hours: ");
        WtotalOvertimeHrs = in.nextDouble();

        System.out.print("Input Thursday total regular hours: ");
        ThurtotalRegHrs = in.nextDouble();
        System.out.print("Input Thursday total overtime hours: ");
        ThurtotalOvertimeHrs = in.nextDouble();

        System.out.print("Input Friday total regular hours: ");
        FritotalRegHrs = in.nextDouble();
        System.out.print("Input Friday total overtime hours: ");
        FritotalOvertimeHrs = in.nextDouble();

//        Math stuff
        MtotalWeeklyPay = ((hourlyWage) * (MtotalRegHrs +
                TtotalRegHrs + WtotalRegHrs + ThurtotalRegHrs + FritotalRegHrs)) + ((MtotalOvertimeHrs + TtotalOvertimeHrs +
                WtotalOvertimeHrs + ThurtotalOvertimeHrs + FritotalOvertimeHrs) * 1.5 * 10);

//        Output
        System.out.println("An employee’s total weekly pay  " + MtotalWeeklyPay);
    }
}