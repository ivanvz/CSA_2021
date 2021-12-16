package Ch10_Ch11.MagicSquare;

import java.util.Scanner;

public class SquareDR {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int count = 1;

        System.out.println(" Enter the size of the Array.");

        int size = scn.nextInt();

        Square magicSquare = new Square(size);
        magicSquare.readSquare();
        System.out.println("\n********** Square " + count + " **********");
        magicSquare.printSquare();
    }
}
