package ArrayHomework.Q3;
import java.util.Scanner;
public class ArrayMethodsDR {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter array row length: ");
        int rowLength = scn.nextInt();
        System.out.println("Enter array column length: ");
        int colLength = scn.nextInt();

        int arr[][] = new int[rowLength][colLength];

        System.out.print("Enter " + rowLength * colLength + " numbers to store in array:\n");
        for (int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.print("Array:\n");
        for (int row = 0; row < rowLength; row++){
            for (int col = 0; col < colLength; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMin: " + ArrayMethods.FindArrayMinimum(arr)
                            + "\nMax: " + ArrayMethods.FindArrayMaximum(arr));
    }
}