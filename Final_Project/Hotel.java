package Final_Project;

public class Hotel {

    private final ProfileRoom[] profileRooms;
    private int currentRoom;

    public Hotel(){
        this.profileRooms = new ProfileRoom[8];
        this.currentRoom = 0;
        addRooms();
    }

    private void addRooms(){
        for(int i = 0; i < 8; ++i)
            profileRooms[i] = new ProfileRoom(i+1);
    }

    public void deleteFromRoom(String customer){
        ProfileRoom profileRoom = FindRoomByCustomerName(customer);

        if(profileRoom != null){
            profileRoom.removeCustomer();
        }

        System.out.println("---Above customer has been removed from system.---");
    }

    public void addRoom(ProfileRoom profileRoom){
        profileRooms[currentRoom++] = profileRoom;
    }

    public void AddCustomer(String customerName, int customerAge, String customerAddress){
        profileRooms[currentRoom].addCustomer(customerName, customerAge, customerAddress);
        currentRoom++;
    }

    public boolean areAllRoomsOccupied(){
        for(ProfileRoom profileRoom : profileRooms)
            if (profileRooms[profileRooms.length - 1].isOccupied()){
                System.out.println("All Rooms are occupied.");
                return true;
            }
        return false;
    }

    public void ViewRooms(){
        for(ProfileRoom profileRoom : profileRooms)
            if(profileRoom.isOccupied())
                System.out.println("Occupied by " + profileRoom.getCustomerName());
            else System.out.println("Vacant");
    }

    public void displayEmptyRooms(){
        for(ProfileRoom profileRoom : profileRooms)
            if(!profileRoom.isOccupied())
                System.out.println("Room " + profileRoom.getRoomNumber() + " is available");

    }

    public ProfileRoom FindRoomByCustomerName(String name){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(name)) {
                    System.out.println("Room: " + profileRoom.getRoomNumber());
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

    public ProfileRoom addToBalance(String customer, double addCost){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(customer)) {
                    profileRoom.addToCustomerBalance(addCost);
                    return profileRoom;
                }
            }
        }
        return null;
    }

    public ProfileRoom orderThankMessage(String customer){
        for(ProfileRoom profileRoom : profileRooms){
            if(profileRoom.isOccupied()){
                if(profileRoom.getCustomerName().equalsIgnoreCase(customer)) {
                    System.out.println("Thank you for your order! It will be delivered shortly.");
                    System.out.println("Your current outstanding bill is: $" + profileRoom.getCustomerBalance());
                    return profileRoom;
                }
            }
        }
        System.out.println("No room is occupied by " + customer);
        return null;
    }

    public void viewOrderedName(){
        String[] names = new String[8];
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

    // partition and sort for listing was sourced from Chegg user "anonymous"
    // They made it more efficient than any mess I made
}