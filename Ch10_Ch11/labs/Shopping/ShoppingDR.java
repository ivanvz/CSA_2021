package Ch10_Ch11.labs.Shopping;
import java.util.*;
import java.math.*;
public class ShoppingDR {
    public static void main(String args[]){
        Scanner scan = new Scanner( System.in );
        String name;
        double price;
        int quantity;
        String continueShopping = "y";

        ShoppingCart shoppingCart = new ShoppingCart();


        do {
            System.out.println( "Enter the name of the item: " );
            name = scan.nextLine();
            System.out.println( "Enter the unit price: " );
            price = scan.nextDouble();
            System.out.println( "Enter the quantity: " );
            quantity = scan.nextInt();
            scan.nextLine();
            shoppingCart.addToCart(name, price, quantity);
            System.out.println(shoppingCart);

            System.out.println( "Continue shopping (y/n)? " );
            continueShopping = scan.nextLine();
        }
        while (continueShopping.equalsIgnoreCase("y"));

        System.out.println("You poor.");
    }
}
