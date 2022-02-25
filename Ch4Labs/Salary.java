package src.Ch4Labs;

import java.text.NumberFormat;

public class Salary
{
    public static void main (String[] args)
    {
        double currentSalary; // employee's current salary
        double raise; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating

        System.out.print ("Enter the current salary: ");
        currentSalary = Keyboard.readDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = Keyboard.readString();

// Compute the raise using if ...
        if (rating.equals("Excellent"))
            raise = currentSalary * 0.06;
        else if (rating.equals("Good"))
            raise = currentSalary * 0.04;
        else if (rating.equals("Poor"))
            raise = currentSalary * 0.015;
        else
        {
            raise = 0;
            System.out.println("Illegal response, no raise given.");
        }

        newSalary = currentSalary + raise;

// Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
    }
}