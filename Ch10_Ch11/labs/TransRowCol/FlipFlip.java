package Ch10_Ch11.labs.TransRowCol;

public class FlipFlip {
//    Method 1: Prints the original Array
    public static void PrintArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[0].length; x++) {
                System.out.print(arr[i][x] + " ");
            }
            System.out.println();
        }
    }

//    Method 2: Prints the rotated array
    public static void SwitchArr(int[][] arr) {

        int[][] arrButLikeBetter = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[0].length; x++) {
                arrButLikeBetter[x][i] = arr[i][x];
            }
        }
        PrintArr(arrButLikeBetter);
    }
}
