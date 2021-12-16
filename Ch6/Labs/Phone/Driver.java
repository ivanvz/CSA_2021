package Ch6.Labs.Phone;

public class Driver {
    public static void main(String[] args){

        Owner owner1 = new Owner("Ivan", "Zhivaga", 04112004, 04112004);
        Address address1 = new Address("1811 Caddington Drive", "RPV", "CA", 90275);
        Mobile mobile1 = new Mobile("Motorola", "Blue", 12);

        Owner owner2 = new Owner("Bob", "Snider", 98560269, 04112004);
        Address address2 = new Address("2231 Silver Spur Rd", "RPV", "CA", 90275);
        Mobile mobile2 = new Mobile("iPhone", "Silver", 8);

        Owner owner3 = new Owner("Hannah", "Corr", 04112004, 12312004);
        Address address3 = new Address("2231 Whitehorn Drive", "RPV", "CA", 90275);
        Mobile mobile3 = new Mobile("iPhone", "Black", 16);

        System.out.println("Owner One: " + "\n");
        System.out.println(owner1);
        System.out.println(address1);
        System.out.println(mobile1 + "\n");

        System.out.println("Owner Two: " + "\n");
        System.out.println(owner2);
        System.out.println(address2);
        System.out.println(mobile2 + "\n");

        System.out.println("Owner Three: " + "\n");
        System.out.println(owner3);
        System.out.println(address3);
        System.out.println(mobile3 + "\n");

    }
}
