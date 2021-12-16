package Ch4.homework;
import java.util.Scanner;
public class Proj6 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double initial, rate, hoursToRate, hoursToGrow, total;


        System.out.print("Enter the initial number of organisms: ");
        initial = scanner.nextDouble();

        System.out.print("Enter the rate of growth (A real number <0): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the number of hours it takes to achieve this rate: ");
        hoursToRate = scanner.nextDouble();

        System.out.print("Enter the number of hours which the population grows: ");
        hoursToGrow = scanner.nextDouble();


        if (hoursToGrow > hoursToRate) {

            total = initial + initial * (hoursToGrow / hoursToRate);

            System.out.println("The predicted result is " + total +

                    " organisms.");

        } else {

            total = Math.round(initial * (rate * (hoursToGrow / hoursToRate)));

            System.out.println("The predicted result is " + total + " organisms.");

        }
    }
}
