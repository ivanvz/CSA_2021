package Ch10_Ch11.labs.Contact;

import java.util.ArrayList;

public class ContactDR {
    public static void main(String args[]) {

        ArrayList<Contact> arr = new ArrayList<Contact>();

        arr.add(new Contact("Antony", "Haggar", 3104423426L, 90274));
        arr.add(new Contact("Bob", "Vance", 2235288696L, 90274));
        arr.add(new Contact("Sofia", "Deek", 3352859275L, 32384));

        for (Contact count : arr) {
            System.out.println(count);
        }

        System.out.println("\n");

        int i = 0;
        while (i < arr.size()) {
            System.out.println(arr.get(i));
            i++;
        }
    }
}
