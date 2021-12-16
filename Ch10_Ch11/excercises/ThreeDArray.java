package Ch10_Ch11.excercises;

import java.util.Scanner;

public class ThreeDArray
{
    public static void main(String args[])
    {
        int arr[][][] = {
                { {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },

                { {10,11,12},
                        {13,14,15},
                        {16,17,18}
                },

                { {100,101,102},
                        {200,201,202},
                        {300,301,302}
                },

        };

//int arr[][][] = new int[3][3][3];
        int i, j, k, num=1;

// for(i=0; i<3; i++)
// {
// for(j=0; j<3; j++)
// {
// for(k=0; k<3; k++)
// {
// arr[i][j][k] = num;
// System.out.print(num);
// num++;

// }System.out.println();

// }System.out.println();
//}

        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                for(k=0; k<3; k++)
                {
                    System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
