package ArrayHomework.Q5;

public class Pascal{
    public static void main (String[] args){
        final int row = 5;
        int[][] triangle = new int [row + 1][];
        triangle[1] = new int[1 + 2];
        triangle[1][1] = 1;

        for (int i = 2; i <= row; i++){
            triangle[i] = new int [i + 2];
            for (int j = 1; j < triangle[i].length - 1; j++)

                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }

        for (int i = 1; i <= row; i++){
            for (int j = 1; j < triangle[i].length - 1; j++)
                System.out.print(triangle[i][j] + " ");
            System.out.println();
        }
    }
}