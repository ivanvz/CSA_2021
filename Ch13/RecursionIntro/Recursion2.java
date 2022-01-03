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
}
