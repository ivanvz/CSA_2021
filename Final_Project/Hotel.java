package Final_Project;

import java.time.LocalTime;

public class Hotel {

    private final ProfileRoom[] profileRooms;
    private int currentRoom;

    public Hotel(){
        this.profileRooms = new ProfileRoom[3];
        this.currentRoom = 0;
        addRooms();
    }

//    Not Accessible in the terminal, this method allows for dynamic expansion of the Hotel's Rooms
    private void addRooms(){
        for(int i = 0; i < 3; ++i)
            profileRooms[i] = new ProfileRoom(i+1);
    }

//    Performs a customer search, followed by deletion if matching
    public void deleteFromRoom(String customer){
        ProfileRoom profileRoom = FindProfileByCustomerName(customer);

        if(profileRoom != null){
            profileRoom.removeCustomer();
            System.out.println("---Above customer has been removed from system.---");
        }

    }

    public void AddCustomer(String customerName, int customerAge, String customerAddress, int stayLength){
        profileRooms[currentRoom].addCustomer(customerName, customerAge, customerAddress, stayLength);
        currentRoom++;
        System.out.println("---Customer profile has been created for " + customerName + "---");
    }

//    Checks if all rooms are occupied, will not allow profile creation if all rooms are full
    public boolean areAllRoomsOccupied(){
        return profileRooms[profileRooms.length - 1].isOccupied();
    }


//    Displays a simple list of all rooms, names for occupied rooms and "vacant" for unoccupied rooms
    public void ViewRooms(){
        for(ProfileRoom profileRoom : profileRooms)
            if(profileRoom.isOccupied())
                System.out.println("Occupied by " + profileRoom.getCustomerName());
            else System.out.println("Vacant");
    }

//    Similar to above, displays rooms that are vacant and their numbers
    public void displayEmptyRooms(){
        for(ProfileRoom profileRoom : profileRooms)
            if(!profileRoom.isOccupied())
                System.out.println("Room " + profileRoom.getRoomNumber() + " is available");
        areAllRoomsOccupied();
    }

//    Brings up the Profile information on a searched customer
    public ProfileRoom FindProfileByCustomerName(String name){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(name)) {
                    System.out.println("Room: " + profileRoom.getRoomNumber());
                    System.out.println("Stay Length (days): " + profileRoom.getStayLength());
                    System.out.println("Occupant Name: " + profileRoom.getCustomerName());
                    System.out.println("Occupant Age: " + profileRoom.getCustomerAge());
                    System.out.println("Occupant Address: " + profileRoom.getCustomerAddress());
                    System.out.println("Occupant Balance: " + profileRoom.getCustomerBalance());
                    return profileRoom;
                }
            }
        }

        System.out.println("No room is occupied by " + name);
        return null;
    }

//     Below manages food ordering, time based ordering, and billing...

//    Displays a menu based on local system time. This is only visual.
    public void customerMenu(){
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 7 && hour < 11) {
            System.out.println("---Breakfast Menu---");
            System.out.println("[1] Salmon Crepe - $15");
            System.out.println("[2] Everything Bagel - $15");
            System.out.println("[3] Hotel Eggs - $12");
            System.out.println("[4] Overpriced Coffee - $17");
            System.out.println("[5] Bottomless Mimosas - $25.99");
        } else if (hour >= 11 && hour < 16) {
            System.out.println("---Lunch Menu---");
            System.out.println("[1] House Salad - $15");
            System.out.println("[2] Falafel Bowl - $15");
            System.out.println("[3] Chicken Tenders - 14");
            System.out.println("[4] Overpriced Salmon - $17");
            System.out.println("[5] IPA - $7");
        } else if (hour >= 16 && hour < 21) {
            System.out.println("---Dinner Menu---");
            System.out.println("[1] Butter Chicken - $14");
            System.out.println("[2] House Burger - $15");
            System.out.println("[3] Pad Thai - $12");
            System.out.println("[4] Overpriced Dasani Water - $17");
            System.out.println("[5] Top Shelf Whiskey Bottle - $67");
        } else if (hour >= 21 || hour < 7) {
            System.out.println("---After Hours---");
            System.out.println("[1] Instant Oat Meal - $7");
            System.out.println("[2] A pile of Nature's Valley crumbs - $4");
            System.out.println("[3] Protein Bar - $4");
            System.out.println("[4] Overpriced Dasani Water - $17");
            System.out.println("[5] A bottle of post-breakup Vodka  - $20");
        }
    }

//    Changes base price array based on local system time, which is then fed to balance collection.
//    Special thanks to Eli Fast for teaching me how to use an array as a Lut, which then led to the below system.
    public double[] customerMenuPrices(){
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 7 && hour < 11){
            return new double[]{15.00, 15.00, 12.00, 17.0, 25.99};
        }
        else if (hour >= 11 && hour < 16){
            return new double[]{15.00, 15.00, 14.00, 17.00, 7.00};
        }
        else if (hour >= 16 && hour < 21){
            return new double[]{14.00, 15.00, 12.00, 17.00, 67.99};
        }
        else if(hour >= 21 || hour < 7){
            return new double[]{7.00, 4.00, 4.00, 17.00, 20.00};
        }
        return new double[0];
    }

//    Adds a double value to the balance section of a customer profile.
    public void addToBalance(String customer, double addCost){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(customer)) {
                    profileRoom.addToCustomerBalance(addCost);
                }
            }
        }
    }

//    Checks a customer's age based on what is in their profile.
//    True = can have alcohol, False = cannot have alcohol
    public boolean alcoholAgeCheck(String customer){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if (profileRoom.getCustomerName().equalsIgnoreCase(customer)){
                    if(profileRoom.isEighteen()){
                        return true;
                    }
                }
            }
        }
        return false;
    }

//    Order confirmation message that display's a customer's outstanding bill
    public void orderThankMessage(String customer){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(customer)) {
                    System.out.println("Thank you for your order! It will be delivered shortly.");
                    System.out.println("Your current outstanding bill is: $" + profileRoom.getCustomerBalance());
                    return;
                }
            }
        }
        System.out.println("No room is occupied by " + customer);
    }

    //A simple checkout that provides a final bill comprised of nights stayed + food ordered
    public void simpleCheckout(String customer){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(customer)) {
                    int stayLength = profileRoom.getStayLength();
                    double stayCost = profileRoom.getStayLength()*179;
                    double customerBalance = profileRoom.getCustomerBalance();
                    double grandTotal = customerBalance + stayCost;

                    System.out.println("Customer has been checked out and removed from system.");
                    System.out.println("Cost for stay of " + stayLength
                    + " night(s) at $179 per night:    $" + stayCost);
                    System.out.println("Total cost of food items ordered:                 $" +
                            profileRoom.getCustomerBalance());
                    System.out.println("Grand Total to be paid:                           $" + grandTotal);
                    profileRoom.removeCustomer();
                    return;
                }
            }
        }
        System.out.println("No room is occupied by " + customer);
    }

    // partition and sort for alphabetical listing was sourced from Chegg user "anonymous"

    public void viewOrderedName(){
        String[] names = new String[3];
        int i = 0;

        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied())
                names[i++] = profileRoom.getCustomerName();
        }

        sort(names,0,i-1);

        for(String name: names)
            if(name != null)
                System.out.println(name + " ");
    }

    public static int partition(String[] arr, int l, int h){
        String pivot = arr[h];
        int i = l -1;

        for(int j = l; j < h; ++j){
            if(arr[j].charAt(0) < pivot.charAt(0)){
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i+1];
        arr[i+1] = pivot;
        arr[h] = temp;

        return i+1;
    }

    public static void sort(String[] arr, int l, int h){

        if(l < h){
            int p = partition(arr, l, h);
            sort(arr,l,p-1);
            sort(arr,p+1,h);
        }
    }

}