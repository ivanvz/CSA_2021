package Final_Project;

import java.util.Scanner;

public class managementTerminal {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        System.out.println("___Work in Progress HMS___");
        managerMenu(hotel);

    }

    public static void managerMenu(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("[1] Add Customer Profile");
//        System.out.println("[2] View All Rooms");
//        System.out.println("[3] Display Empty Rooms");
//        System.out.println("[4] Delete Customer from system");
        System.out.println("[5] Search Profile by Customer name");
        System.out.println("[6] List Customer Names");
        System.out.println("[7] Exit");

        System.out.println("Select Option");

        int s = scanner.nextInt();

        String name = "";
        int age;
        String address = "";



        switch (s){
            case 1:
                System.out.println("Enter customer name");
                scanner.nextLine();
                name = scanner.nextLine();
                System.out.println("Enter customer age");
                age = scanner.nextInt();
                System.out.println("Enter customer address");
                scanner.nextLine();
                address = scanner.nextLine();

                hotel.AddCustomer(name, age, address);

                break;

            case 2:
                hotel.ViewRooms();
                break;
            case 3:
                hotel.displayEmptyRooms();
                break;
            case 4:
                System.out.println("Enter Customer name");
                scanner.nextLine();
                name = scanner.nextLine();
                hotel.deleteFromRoom(name);
                break;
            case 5:
                System.out.println("Enter Customer name");
                scanner.nextLine();
                name = scanner.nextLine();
                hotel.FindRoomByCustomerName(name);
                break;
            case 6:
                hotel.viewOrderedName();
                break;
            case 7:
                System.out.println("Closing");
            default:
                System.out.println("Please enter a valid input");
        }

        if( s != 7 )
            managerMenu(hotel);
    }
}

