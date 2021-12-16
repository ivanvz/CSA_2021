package Ch10_Ch11.labs.Shopping;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingCart {
    private Item[] cart; //an array of items
    private int itemCount; //total items in cart
    private double totalPrice; //total price of items in cart
    private int capacity; //currrent cart capacity

    public ShoppingCart(){
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    public void addToCart(String itemName, double price, int quantity){
        if (itemCount == cart.length)
            increaseSize();

        cart[itemCount] = new Item(itemName, price, quantity);
        itemCount++;

        totalPrice += price * quantity;
    }

    private void increaseSize(){
        Item[] temp = new Item[cart.length + 10];
        for (int i = 0; 0 < cart.length; i++)
            temp[i] = cart[i];

        cart = temp;
    }

    BigDecimal roundTotal = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);

    public BigDecimal getTotal(){
        return roundTotal;
    }

    @Override
    public String toString() {
       String contents = "\nShooping Cart\n";
       contents += "\nItem\t\tUnit Price\t Quantity\t Total\n";

       for (int i = 0; i < itemCount; i++)
           contents += cart[i].toString() + "\n";
       contents += "\nTotal Price: " + roundTotal;
       contents += "\n";
       return contents;
    }
}


