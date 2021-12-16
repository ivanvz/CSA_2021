package Ch4.homework;
import java.util.Scanner;
public class Proj2 {
    public static void main (String args[]){
        Scanner input = new Scanner( System.in );

        int side1; // length of side 1
        int side2; // length of side 2
        int side3; // length of side 3
        boolean isRightTriangle; // whether the sides can form a triangle

        // get values of three sides
        System.out.print( "Enter side 1: " );
        side1 = input.nextInt();

        System.out.print( "Enter side 2: " );
        side2 = input.nextInt();

        System.out.print( "Enter side 3: " );
        side3 = input.nextInt();

        // square the sides
        int side1Square = side1 * side1;
        int side2Square = side2 * side2;
        int side3Square = side3 * side3;

        // test if these form a right triangle
        isRightTriangle = false;

        if ( ( side1Square + side2Square ) == side3Square )
            isRightTriangle = true;
        else if ( ( side1Square + side3Square ) == side2Square )
            isRightTriangle = true;
        else if ( ( side2Square + side3Square ) == side1Square )
            isRightTriangle = true;

        if ( isRightTriangle )
            System.out.println( "These are the sides of a right triangle." );
        else
            System.out.println( "These do not form a right triangle." );
    }
}
