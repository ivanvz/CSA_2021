package ch2.labs;

import java.util.Scanner;

public class StringInput {
    public static void  main(String args[]){

        Scanner scn = new Scanner(System.in);
        String userInput;
        String firstHalfInput = "";
        String secondHalfInput = "";
        char lastCharacter;
        char firstCharacter;
        String middleThree;
        int userIndexInput;
        char userIndexOutput;
        String userInputRedux;
        String firstHalfInputRedux;
        String secondHalfInputRedux;
        String comparisonEntry;

        //Initial User Input
        System.out.println ("Enter anything");
        userInput = scn.nextLine();

        //First Half of User Input
        firstHalfInput = userInput.substring(0, userInput.length() / 2);
        System.out.println (firstHalfInput);

        //Second Half of User Input
        secondHalfInput = userInput.substring(userInput.length() / 2, userInput.length());
        System.out.println(secondHalfInput);

        //String Length
        System.out.println(userInput.length());

//        Return last character
//        also can use: str.slice(-1);
        lastCharacter = userInput.charAt(userInput.length() - 1);
        System.out.println(lastCharacter);

//        Return first character
        firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

//        return middle 3
        middleThree = userInput.substring(((userInput.length() / 2) - 1) , (userInput.length() / 2) + 2);
        System.out.println(middleThree);

//        Return at given index
        System.out.println ("Enter index point for: " + userInput);
        userIndexInput = scn.nextInt();
        userIndexOutput = userInput.charAt(userIndexInput);
        System.out.println(userIndexOutput);

//        Rotated Half
        Scanner scnRedux = new Scanner(System.in);

        System.out.println ("Enter for rotation: ");
        userInputRedux = scnRedux.nextLine();

        firstHalfInputRedux = userInputRedux.substring(0, userInputRedux.length() / 2);
        secondHalfInputRedux = userInputRedux.substring(userInputRedux.length() / 2, userInputRedux.length());
        System.out.println(secondHalfInputRedux + firstHalfInputRedux);

//        Entry Comparison
        Scanner scnComparison = new Scanner(System.in);

        System.out.println("Enter for comparison:");
        comparisonEntry = scnComparison.nextLine();

        System.out.println("Entry: "+ comparisonEntry);

        if (comparisonEntry.equals(userInputRedux)) {

            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
