package Ch4.homework;
import java.util.*;
public class Proj3 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        double minutes, cost;

        while (true){
            System.out.print("Enter call minutes: ");
            minutes = s1.nextDouble();
            if (minutes < 0)
                System.out.println("Enter only positive value!");
            else
                break;
        }

        if (minutes <= 2)
            cost = 1.15;

        else{
            cost = 1.15;
            minutes = Math.ceil(minutes - 2);
            cost = cost + minutes * 0.50;
        }
        System.out.println("\nTotal cost = "+cost);
    }
}
