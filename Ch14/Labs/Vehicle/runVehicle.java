package Ch14.Labs.Vehicle;
import java.util.Scanner;

public class runVehicle {
    public static void main(String args[]){
        Vehicle car = new Car(5, "Electric", 120);
        Vehicle truck = new Truck(12, "Diesel", 80);

        int passengerInput;
        Scanner scn = new Scanner(System.in);

        System.out.println("---Car---");
        System.out.println("Car can carry passenger load of: " + car.CanCarry());
        System.out.println("Engine type: " + car.EngineType());
        System.out.println("Max speed: " + car.MaxSpeed());

        System.out.println();

        System.out.println("---Truck---");
        System.out.println("Truck can carry passenger load: " + truck.CanCarry());
        System.out.println("Engine type: " + truck.EngineType());
        System.out.println("Max speed: " + truck.MaxSpeed());
    }
}
