package ArrayHomework.Q4;
import java.util.Scanner;
import java.util.Arrays;
public class MergeDR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthA, lengthB;
        int i;
        System.out.println("Enter length of first array: ");
        lengthA = input.nextInt();
        System.out.println("Enter length of second array: ");
        lengthB = input.nextInt();

//        Calling up 3 arrays, adding inputs
        int []a = new int[lengthA];
        int []b = new int[lengthB];
        int []c = new int[lengthA + lengthB];

        System.out.println("Enter values for first array: ");
        for(i=0; i < lengthA; i++)
            a[i] = input.nextInt();
        System.out.println("Enter values for second array: ");
        for(i=0; i < lengthB; i++)
            b[i] = input.nextInt();

//        array A sorted in ascending order, premade sort function included with java
        Arrays.sort(a);

//        array b sorted in descending order
        Merge.SortArrays(b, lengthB);

//        both arrays are merged into one
        Merge.mergeArrays(a,b,c, lengthA, lengthB);

        System.out.println("Array A:");
        for(i=0; i < lengthA; i++)
            System.out.print(a[i]+" ");
        System.out.println();

        System.out.println("Array B:");
        for(i=0; i < lengthB; i++)
            System.out.print(b[i]+" ");
        System.out.println();

        System.out.println("Wonderfully combined and sorted Array C:");
        for(i=0; i < lengthA + lengthB; i++)
            System.out.print(c[i]+" ");
        System.out.println();
    }
}