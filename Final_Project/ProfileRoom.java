package Final_Project;

public class ProfileRoom {

    private boolean Occupied;
    private int roomNumber;
    private String customerName;
    private int customerAge;
    private String customerAddress;
    private double foodItemCost;
    private double customerBalance;

    public ProfileRoom(int roomNumber){
        this.Occupied = false;
        this.roomNumber = roomNumber;
        this.customerName = null;
        this.customerAge = 0;
        this.customerAddress = null;
        this.customerBalance = 0;
        this.foodItemCost = 0;
    }

    public boolean isOccupied() {
        return Occupied;
    }


    public void addCustomer(String customerName, int customerAge, String customerAddress){
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerAddress = customerAddress;
        this.Occupied = true;
    }

    public void removeCustomer(){
        this.customerName = null;
        this.Occupied = false;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public double getCustomerBalance(){
        return customerBalance;
    }

    public void addToCustomerBalance(double foodItemCost){
        this.foodItemCost = foodItemCost;
        customerBalance = customerBalance + foodItemCost;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Occupied=" + Occupied +
                ", roomNumber=" + roomNumber +
                ", customerName='" + customerName +
                ", customerAge='" + customerAge +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}