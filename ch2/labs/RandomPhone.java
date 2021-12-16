package ch2.labs;

import java.util.Random;

public class RandomPhone {
    public static void main (String[] args){

        //Declaration of variables
        Random generator = new Random();
        int blockA;
        double first3Digits;

        //Parameters for random generation are set
        blockA = generator.nextInt(900) + 100;
        first3Digits = generator.nextInt(9999);



        //Print statement
        System.out.println("Phone number generator: " + blockA + "-" + first3Digits);

    }
}
