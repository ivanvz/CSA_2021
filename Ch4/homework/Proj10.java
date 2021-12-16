package Ch4.homework;

import java.util.Scanner;

public class Proj10 {

    public static void main (String[] args){
        int yrs, count=0;
        double salary=0, startsal, increase;

        Scanner scn = new Scanner(System.in);

        System.out.println("Input starting salary: ");
        startsal = scn.nextInt();

        salary=startsal;
        System.out.println("Enter percentage increase: ");

        increase = scn.nextInt();
        System.out.println("Enter no. years in schedule: ");

        yrs = scn.nextInt();

        for (count=1; count<=yrs; count++){

            if (count==1){
                System.out.println(startsal);
            }

            if (count==2){
                salary = (startsal * (increase/100)) + startsal;
                System.out.println("Salary: " + salary);
            }
            else if (count>2 && count<=10){
                salary = (salary * (increase / 100)) + salary;
                System.out.println("Salary: " + salary);
            }
            else if (count>=10){
                System.out.println(salary);
            }
        }

    }
}
