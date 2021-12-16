package Ch4.homework;
import java.util.Scanner;
public class Proj7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        while (true) {
            System.out.println("Enters the exponent:");
            int b = scanner.nextInt();
            if (b == -1) {
                break;
            }
            int c = (int) Math.pow(2, b);
            System.out.println("Your output is: " + c);
        }

    }
}