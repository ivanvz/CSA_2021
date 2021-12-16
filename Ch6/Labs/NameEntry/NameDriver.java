package Ch6.Labs.NameEntry;
import java.util.*;
public class NameDriver {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        String first, middleInitial, last;

        System.out.println("Enter your first name: ");
        first = scn.nextLine();

        System.out.println("Enter your middle initial: ");
        middleInitial = scn.nextLine();

        System.out.println("Enter your last name: ");
        last = scn.nextLine();

        Name personInfo = new Name(first, middleInitial, last);

        System.out.println("Full name:  " + first + " " + middleInitial + " " + last);
        System.out.println("Last name format:   " + last + ", " + first + " " + middleInitial);

        System.out.println("Initials:   ");

        System.out.println("Characters in name:    ");

    }
}
