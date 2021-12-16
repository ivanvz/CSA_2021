package Ch10_Ch11.MagicSquare;

import java.util.Scanner;

public class Square {
    int[][] square;
    Scanner scn = new Scanner(System.in);

    public Square(int size){
        square = new int[size][size];
    }

    public int sumRow(int row){
        int sum = 0;
        for (int col = 0; col < square.length; col++)
            sum += square[row][col];

        return sum;
    }

    public int sumCol(int col){
        int sum = 0;
        for (int row = 0; row < square.length; row++)
            sum += square[row][col];

        return sum;
    }

    public int sumMainDiagonal(){
        int sum = 0;
        for (int i = 0; i < square.length; i++)
            sum += square[i][i];

        return sum;
    }

    public int sumReverseDiagonal(){
        int sum = 0;
        for (int i = 0; i < square.length; i++)
            sum += square[i][square.length - 1];

        return sum;
    }

    public void readSquare(){
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col++){
                System.out.println("Enter the input of "+row+" "+col);
                square[row][col] = scn.nextInt();
        }
    }

    public void printSquare(){
        for (int row = 0; row < square.length; row++)
        for (int col = 0; col < square.length; col++){
            System.out.println(square[row][col] + "\t");
            System.out.println();
        }
    }

    public boolean magic(){
        int checkSum = sumMainDiagonal();
        boolean isMagic = (sumReverseDiagonal() == sumMainDiagonal());

        int row = 0;
        while (row < square.length && isMagic)
            if (sumRow(row)!=checkSum)
                isMagic = false;
            else row++;

        int col = 0;
        while (col < square.length && isMagic)
            if (sumCol(row)!=checkSum)
                isMagic = false;
            else col++;

        return isMagic;
    }
}
