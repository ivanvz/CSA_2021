package ch3.hw;
import java.util.Scanner;
import java.lang.Math;
public class proj3_3 {
    public static void  main(String args[]){
//        Declarations
        Scanner in = new Scanner(System.in);
        double mass;
        double velocity;
        double momentum;
        double kineticEnergy;

//        User Inputs + Scans
        System.out.println("Enter the mass (kg) of object:");
        mass = in.nextDouble();
        System.out.println("Enter the velocity (meters per sec) of object:");
        velocity = in.nextDouble();

//        Math stuff
        momentum = (mass * velocity);
        kineticEnergy = (Math.pow(velocity,2) * momentum) / 2;

//        Outputs
        System.out.println("Object momentum:" + momentum + " kg * m/s");
        System.out.println("Object kinetic energy:" + kineticEnergy + " J");
    }
}
