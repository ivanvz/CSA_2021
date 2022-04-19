package Final_Project;

public class ProfileRoom {

    private boolean Occupied;
    private final int roomNumber;
    private String customerName;
    private int customerAge;
    private String customerAddress;
    private double foodItemCost;
    private double customerBalance;
    private int stayLength;

//    Constructor
    public ProfileRoom(int roomNumber){
        this.Occupied = false;
        this.roomNumber = roomNumber;
        this.customerName = null;
        this.customerAge = 0;
        this.customerAddress = null;
        this.customerBalance = 0;
        this.foodItemCost = 0;
        this.stayLength = 0;
    }

    public boolean isOccupied() {
        return Occupied;
    }

//    Initial customer profile parameters
    public void addCustomer(String customerName, int customerAge, String customerAddress, int stayLength){
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerAddress = customerAddress;
        this.Occupied = true;
        this.stayLength = stayLength;
    }

    public void addCustomer(String customerName, int customerAge, int stayLength){
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.Occupied = true;
        this.stayLength = stayLength;
    }

    public void removeCustomer(){
        this.customerName = null;
        this.Occupied = false;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

//    Get and Set
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

    public int getStayLength(){
        return stayLength;
    }

//    Age Check (for alcohol purchases)
    public boolean isEighteen(){
        return getCustomerAge() >= 21;
    }

//    Adds to customer's overall balance (will be added to room cost)
    public void addToCustomerBalance(double foodItemCost){
        this.foodItemCost = foodItemCost;
        customerBalance = customerBalance + foodItemCost;
    }
}