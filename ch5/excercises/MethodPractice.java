package ch5.excercises;
import java.util.*;
class MethodPractice {
    static Scanner scn = new Scanner(System.in);

    public static int add(int x, int y){
        System.out.println("--Addition--");

        System.out.println("Enter x value: ");
        x = scn.nextInt();

        System.out.println("Enter y value: ");
        y = scn.nextInt();

        int z = x + y;
        return z;
    }

    public static int mult(int x, int y){
        System.out.println("--Multiplication--");

        System.out.println("Enter x value: ");
        x = scn.nextInt();

        System.out.println("Enter y value: ");
        y = scn.nextInt();

        int z = x * y;
        return z;
    }

    public static int div(int x, int y){
        System.out.println("--Division--");

        System.out.println("Enter x value: ");
        x = scn.nextInt();

        System.out.println("Enter y value: ");
        y = scn.nextInt();

        int z = x / y;
        return z;
    }

    public static int add(int x, int y, int 瘂){
        System.out.println("--Addition, 3 values--");

        System.out.println("Enter x value: ");
        x = scn.nextInt();

        System.out.println("Enter y value: ");
        y = scn.nextInt();

        System.out.println("Enter 3rd value: ");
        瘂 = scn.nextInt();

        int z = x + y + 瘂;
        return z;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println(add(a, b));
        System.out.println(mult(a, b));
        System.out.println(div(a, b));
        System.out.println(add(a, b, c));
    }
}
