package Ch14.Labs.Vehicle;

public class Truck implements Vehicle {
    int maxSpeed;
    String etype;
    int numPassengers;


    public Truck(int numpassengers, String EType, int maxspeed){
        this.numPassengers = numpassengers;
        this.etype = EType;
        this.maxSpeed = maxspeed;
    }

    public boolean CanCarry() {
        if (numPassengers > 10){
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
