package Ch14.Labs.Vehicle;

public class Car implements Vehicle {
    int maxSpeed;
    String etype;
    int numPassengers;


    public Car(int numpassengers, String EType, int maxspeed){
        this.numPassengers = numpassengers;
        this.etype = EType;
        this.maxSpeed = maxspeed;
    }

    public boolean CanCarry() {
        if (numPassengers > 6){
            return false;}
        else {
            return true;
        }
    }

    public String EngineType() {
        return etype;
    }

    public int MaxSpeed() {
        return maxSpeed;
    }
}