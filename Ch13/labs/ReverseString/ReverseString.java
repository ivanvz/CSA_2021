package Ch13.labs.ReverseString;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String reversePhrase = "";

        System.out.println("Input a string to be reversed: ");
        reversePhrase = scn.next();

        System.out.println("Reversed string: " + reverseString(reversePhrase));
    }

    public static String reverseString(String string)
    {
        if (string.length() == 1)
            return string;
        if (string.length() == 0)
            return "Error, no input.";
        else return reverseString(string.substring(1)) + string.charAt(0);
    }
}