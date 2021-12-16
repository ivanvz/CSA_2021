package Ch10_Ch11.labs.FindDuplicates;
import java.util.ArrayList;

public class DetectDuplicateDriver {
    public static void main(String args[]){


        String[] testArray = {"Cathy","John", "Patric", "jude", "John", "Lisa", "Omar", "Cathy"};
        int n = testArray.length;

        DuplicateDetectionClass.DetectDupes(testArray, n);
    }
}
