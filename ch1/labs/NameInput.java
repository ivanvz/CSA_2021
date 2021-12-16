package ch1.labs;

import java.util.Scanner;


public class NameInput
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println ("Can you plz enter ur 1st name");
        firstName = scn.nextLine();

        System.out.println ("Can you plz enter ur last name");
        lastName = scn.nextLine();

        System.out.println ("Hello Mr. " + firstName + " "+ lastName);
    }
}
