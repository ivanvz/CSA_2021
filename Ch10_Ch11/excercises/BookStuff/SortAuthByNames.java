package Ch10_Ch11.excercises.BookStuff;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.*;
public class SortAuthByNames {
    public static void main(String args[]){
//        Author count;
        ArrayList<Author> arr = new ArrayList<Author>();

        arr.add(new Author("Frank", "Herbert", "Dune"));
        arr.add(new Author("William", "Shakespear", "Hamlet"));
        arr.add(new Author("Fyodor", "Dostoevsky", "Crime and Punishment"));

        for (Author count : arr){
            System.out.println(count);
        }

        System.out.println("\n");

        int i = 0;
        while (i < arr.size()){
            System.out.println(arr.get(i));
            i++;
        }
    }
}
