package Ch10_Ch11.labs.Shopping;
import java.util.ArrayList;
import java.util.Iterator;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("hi");

        Iterator iter = list.iterator();

        list.set(0, "hi"); //replaces the item at 0

        for (String text : list) {
            System.out.print(text);
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
