package Ch10_Ch11.labs.Shopping;
import java.util.*;

public class ArrayDR {
    public static void main(String args[]){
        Scanner scan = new Scanner( System.in );
        String name;
        double price;
        int quantity;
        String continueShopping = "y";

        ArrayCart arrayCart = new ArrayCart();


        do {
            System.out.println( "Enter the name of the item: " );
            name = scan.nextLine();
            System.out.println( "Enter the unit price: " );
            price = scan.nextDouble();
            System.out.println( "Enter the quantity: " );
            quantity = scan.nextInt();
            scan.nextLine();
            arrayCart.addToCartArray(name, price, quantity);
            System.out.println(arrayCart);

            System.out.println( "Continue shopping (y/n)? " );
            continueShopping = scan.nextLine();
        }
        while (continueShopping.equalsIgnoreCase("y"));

        System.out.println("You poor.");
    }
}
