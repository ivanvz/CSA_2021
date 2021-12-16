package Ch10_Ch11.labs.FindDuplicates;
import java.util.ArrayList;
public class DuplicateDetectionClass {

     public static void DetectDupes(String array[], int length) {

        ArrayList<String> storeDuplicatesArray = new ArrayList<String>();

        boolean DuplicatesPresent = false;

        for (int i = 0; i < length - 1; i++) {
            for (int y = i + 1; y < length; y++) {
                if (array[i] == array[y]){

                    //checks if stuff is present in array list, if there isn't anything just breaks
                    //boolean already set to false so isn't an issue
                    if (storeDuplicatesArray.contains(array[i])) {
                        break;
                    }

                   //if it does detect something, adds it to duplicates array for later output
                    else {
                        storeDuplicatesArray.add(array[i]);
                        DuplicatesPresent = true;
                    }
                }
            }
        }

        if (DuplicatesPresent == true){
            System.out.print("Duplicates: " + storeDuplicatesArray);
        }
        else {
            System.out.println("No duplicates detected. I may have messed something up though.");
        }
    }
}
