package Final_Project;
// Extension allows for easy execution of Menu
public class ManagementTerminal extends ManagerMenu {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        WaitingList waitingList = new WaitingList();

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("━━ Zhivaga Hotel Management Terminal ━━");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        managerMenu(hotel, waitingList);
    }
}