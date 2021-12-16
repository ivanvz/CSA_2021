package Ch4.homework;
import java.util.Scanner;
import java.util.*;
public class Proj8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter value: ");
            int b = scanner.nextInt();
            if (b == -1) {
                break;
            }

            System.out.println("Specify exponent: ");
            int a = scanner.nextInt();

            int c = (int) Math.pow(a, b);
            System.out.println("Your output is: " + c);
            System.out.println("Specified exponent was: " + a);
        }

    }
}