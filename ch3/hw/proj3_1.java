package ch3.hw;

import java.util.Scanner;
import java.lang.Math;

public class proj3_1 {
    public static void  main(String args[]){

        Double sideLength;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter side length: ");
        sideLength = scn.nextDouble();

        Double surfaceArea = (Math.pow(sideLength, 2) * 6);

        System.out.println (surfaceArea);
    }
}
