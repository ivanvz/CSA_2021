package Final_Project;

import java.util.Scanner;

public class ManagerMenu {

    public static void managerMenu(Hotel hotel, WaitingList waitingList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("[0] View Waiting List");
        System.out.println("[1] Add Customer Profile");
        System.out.println("[2] View All Rooms (Vacant and Occupied)");
        System.out.println("[3] Display Vacant Rooms");
        System.out.println("[4] Delete Customer from system");
        System.out.println("[5] Search Profile by Customer name");
        System.out.println("[6] Alphabetically List Customer Names");
        System.out.println("[7] Order Food to Room");
        System.out.println("[8] Customer Checkout");
        System.out.println("[9] Exit");
        System.out.println("Select Option");

        int s = scanner.nextInt();

        String name;
        int age;
        String address;
        int stayLength;
        String input;

        switch (s) {
//            Simple display of names and numbers on waiting list
            case 0:
                waitingList.viewWaitingList();
                break;
            case 1:
//                Checks if all rooms are occupied, then gives the option for a waiting list entry to be made
                if (hotel.areAllRoomsOccupied()) {
                    System.out.println("All Rooms are occupied. Would you like to add to the waiting list?");
                    System.out.println("Y / N");
                    scanner.nextLine();
                    input = scanner.nextLine();
                    if(input.equalsIgnoreCase("n")){
                        break;
                    }
                    if (input.equalsIgnoreCase("y")){
                        waitingList.AddWaitingListMember();
                        break;
                    }
                    else break;
                } else {
//                    If there is a free room, proceedes with standard profile registration
                    System.out.println("Enter customer name");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Enter customer age");
                    age = scanner.nextInt();
                    System.out.println("Enter customer address");
                    scanner.nextLine();
                    address = scanner.nextLine();
                    System.out.println("Enter length of customer stay (days)");
                    stayLength = scanner.nextInt();

                    hotel.AddCustomer(name, age, address, stayLength);
                    break;
                }
            case 2:
//                Displays all rooms, with occupants included
                hotel.ViewRooms();
                break;
            case 3:
//                isOccupied = false, displays the room
                hotel.displayEmptyRooms();
                break;
            case 4:
//                Deletes customer from hotel via name search, free's slot in Array
                System.out.println("Enter Customer name");
                scanner.nextLine();
                name = scanner.nextLine();
                hotel.deleteFromRoom(name);
                break;
            case 5:
//                Displays full customer profile Via name search
                System.out.println("Enter Customer name");
                scanner.nextLine();
                name = scanner.nextLine();
                hotel.FindProfileByCustomerName(name);
                break;
            case 6:
                hotel.viewOrderedName();
                break;
            case 7:
                hotel.customerMenu();
                int n = scanner.nextInt();
//                Checks if input is valid
                if (n > 5) {
                    System.out.println("Invalid input. Returning to Main Menu.");
                }
//                Displays Menu based on time of day
//                7am - 11am: Breakfast
//                11am - 4pm: Lunch
//                4pm - 8pm: Dinner
                else {
                    double balance = hotel.customerMenuPrices()[n - 1];
                    System.out.println("Enter Customer name for order billing");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    if (n == 5 && hotel.alcoholAgeCheck(name)) {
                        hotel.addToBalance(name, balance);
                        hotel.orderThankMessage(name);
                    }
                    if (n < 5) {
                        hotel.addToBalance(name, balance);
                        hotel.orderThankMessage(name);
                    }
                    if (n == 5 && !hotel.alcoholAgeCheck(name)) {
                        System.out.println("Customer is too young to order alcohol.");
                        System.out.println("Returning to Main Menu...");
                    }
                }
                break;
            case 8:
//                Final Checkout
                System.out.println("Enter Customer name for checkout");
                scanner.nextLine();
                name = scanner.nextLine();
                hotel.simpleCheckout(name);
                break;
            case 9:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Please enter a valid input");
        }

        if (s != 9)
            ManagerMenu.managerMenu(hotel, waitingList);
    }
}
