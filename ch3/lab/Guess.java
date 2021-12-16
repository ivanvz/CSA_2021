package ch3.lab;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String args[]){
        int numToGuess;
        int guess = 0;
        int totalGuessCounter = 0;
        int guessHigh = 0;
        int guessLow = 0;
        Scanner scn = new Scanner(System.in);
        Random generator = new Random();

        numToGuess = generator.nextInt(10) + 1;

        while (guess != numToGuess){
            System.out.println("Enter a guess out of 10: ");
            guess = scn.nextInt();
            totalGuessCounter++;

            if (guess>numToGuess){
                guessHigh++;
                System.out.println("Your guess to too high! Try again.");
            }
            if (guess<numToGuess){
                guessLow++;
                System.out.println("Your guess is too low! Try again dummy.");
            }

        }

        System.out.println("Your guess of " + guess + " is correct. Yay! " +
                "It did take you " + totalGuessCounter + " total tries though...");
        System.out.println("Times guessed too high: " + guessHigh);
        System.out.println("Times guessed too low: " + guessLow);
    }
}
