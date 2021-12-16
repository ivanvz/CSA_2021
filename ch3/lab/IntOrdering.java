package ch3.lab;

import java.util.Scanner;

public class IntOrdering {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int numOne;
        int numTwo;
        int numThree;
        int numFour;

        int minValue;

        System.out.println("Enter first number: ");
        numOne = scn.nextInt();

        System.out.println("Enter second number: ");
        numTwo = scn.nextInt();

        System.out.println("Enter third number: ");
        numThree = scn.nextInt();

        System.out.println("Enter fourth number: ");
        numFour = scn.nextInt();

        if (numOne<numTwo){
            if (numThree<numOne){
                minValue = numThree;
            }
            else {
                minValue = numOne;
            }
        }
        else{
            if (numTwo<numThree){
                minValue = numTwo;
            }
            else {
                minValue = numThree;
            }
        }

        System.out.println("The minimum value if the three numbers is: " + minValue);

    }
}
