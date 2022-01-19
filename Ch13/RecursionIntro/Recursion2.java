package Ch13.RecursionIntro;
import java.util.Scanner;
public class Recursion2 {

    public static void main(String[] args){
        int Num, theFact, theSum;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Num = scn.nextInt();

        sum(Num);
        System.out.println("The sum is " + sum(Num));
    }
    public static int sum (int num){
        int result;
        if(num == 1)
            return 1;
        else
            return num + sum(num-1);
    }
    public static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n * fact(n-1);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
        } else {
            return 1;
        }
    }

    public static int mystery(int a, int b)
    {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return mystery(a+a, b/2);

        return mystery(a+a, b/2) + a;
    }
}
