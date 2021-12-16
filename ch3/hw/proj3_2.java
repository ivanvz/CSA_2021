package ch3.hw;

import java.util.Scanner;

public class proj3_2 {
    public static void main(String args[]){

//        Delcarations
        Scanner scn = new Scanner(System.in);
        double radiusInput;
        double diameter;
        double circum;
        double surfacearea;

//        User Inputs
        System.out.print("Input sphere radius:");
        radiusInput = scn.nextDouble();

//        Math stuff
        diameter = 2 * radiusInput;
        circum = 2 * (3.14 * radiusInput);
        surfacearea = 3.14 * (radiusInput * radiusInput);

//        Outputs
        System.out.println("Diameter:" + diameter);
        System.out.println("Circumference:" + circum);
        System.out.println("Surface area:" + surfacearea);
    }
}
