package ch3.lab;
import java.util.Random;
import java.util.Scanner;
public class DiceNotLab {
    public static <args> void main(String args[]){
        int die1Value = 0;
        int die2Value = 0;
        int count = 0;
        int snakeEyes = 0;
        int boxcard = 0;
        int rolls = 0;
        Random generator = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter roll amount:");
        rolls = scn.nextInt();

        while(count<rolls) {
            die1Value = (generator.nextInt(6) + 1);
            die2Value = (generator.nextInt(6) + 1);

            if (die1Value == die2Value) {
                if (die1Value == 1 && die2Value == 1) {
                    snakeEyes++;
                } else if (die1Value == 6 && die2Value == 6) {
                    boxcard++;
                }
            }

            System.out.println(" Dice#1--> " + die1Value + " Dice#2--> " + die2Value);

            count++;
        }
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println ("You rolled Boxcard " + boxcard + " out of " + count + " rolls.");
    }
}
