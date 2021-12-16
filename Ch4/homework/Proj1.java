package Ch4.homework;
import java.util.Scanner;
public class Proj1 {
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numerator;
        int denominator;

        if (a > b){

            numerator = a;
            denominator = b;

        }

        else { numerator = b; denominator = a;

        }

        System.out.println("Quotient: " + numerator/denominator);
        System.out.println("Remainder: " + numerator%denominator);}
}
