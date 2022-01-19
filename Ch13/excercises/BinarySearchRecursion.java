package Ch13.excercises;
import java.util.Arrays;
public class BinarySearchRecursion {
    public static int RecBinarySearch (int[] intArray, int lowPos, int highPos, int target){
        int midPos;
        if (lowPos > highPos){
            return -1;
        }
        else {
            midPos = (lowPos +highPos)/2;
            if (intArray[midPos] < target){
                return RecBinarySearch(intArray, midPos+1, highPos, target);
            }
            if (intArray[midPos] > target){
                return RecBinarySearch(intArray, midPos-1, lowPos, target);
            }

            //what do we dp of the middle value is equal to the target?
        }
        return midPos;
    }
}
