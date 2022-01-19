package Ch13.labs.CheckDigit;
import java.util.Scanner;
public class DigitPlay {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; //a number
        String c;
            System.out.print("Please enter a positive integer: ");

            num = scan.nextInt();

            if (num <= 0)
                System.out.println(num + " isn't positive -- start over!!");

            else {
                System.out.println("\nThe number " + num + " has the sum of isdigits " + SumDigits(num) + " digits.");

                // checks if the remainder of dividing the "sum" by 7 is zero
                System.out.println("Is the sum divisible by 7?");
                if (SumDigits(num) % 7 == 0)
                    System.out.println(num + " --- ok");
                else
                    System.out.println(num + " --- error");
                }
//            System.out.println("Do you want to continue y or n?");
//            c = scan.nextLine();
//            if(c.equalsIgnoreCase("n")) {
//               break;

        }

// -----------------------------------------------------------

// Recursively sums the digits in a positive integer (below)

// -----------------------------------------------------------

    public static int SumDigits(int num) {
        int total = 0;
        if (num < 10)
            return num;
        return total + (num % 10) + SumDigits(num / 10);
    }
}
