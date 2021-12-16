package Ch10_Ch11.labs.Shopping;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCart {
    private ArrayList<Item> Cart = new ArrayList<Item>();
    private int itemCount; //total items in cart
    private double totalPrice; //total price of items in cart
    private int capacity; //current cart capacity

    public ArrayCart(){
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
    }

    public void addToCartArray(String itemName, double price, int quantity){
        Item item = new Item(itemName, price, quantity);
        Cart.add(item);
    }

    BigDecimal roundTotal = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);

    public BigDecimal getTotal(){
        return roundTotal;
    }

    @Override
    public String toString() {
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\t Quantity\t Total\n";

        for (Item item : Cart) {
            contents += item.toString() + "\n";
        }
        contents += "\nTotal Price: " + roundTotal;
        contents += "\n";
        return contents;
    }
}