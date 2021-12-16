package ch5.labs;
import java.util.*;
class MethodLab {
    static Scanner scn = new Scanner(System.in);

    public static double cube(double s){
        System.out.println("--Cube Volume--");

        System.out.println("Enter side length: ");
        s = scn.nextDouble();

        double v = Math.pow(s, 3);
        return v;
    }

    public static double rect(double l, double w, double h) {
        System.out.println("--Rectangular Prism Volume--");

        System.out.println("Enter length: ");
        l = scn.nextDouble();

        System.out.println("Enter width: ");
        w = scn.nextDouble();

        System.out.println("Enter height: ");
        h = scn.nextDouble();

        double v = l * w * h;
        return v;
    }

    public static double sphere(double r){
        System.out.println("--Sphere Volume--");

        System.out.println("Enter radius: ");
        r = scn.nextDouble();

        double v = (4.0 * Math.PI * Math.pow(r, 3))/3.0;
        return v;
    }

    public static double cylinder(double r, double h){
        System.out.println("--Right Circular Cylinder Volume--");

        System.out.println("Enter radius: ");
        r = scn.nextDouble();

        System.out.println("Enter height: ");
        h = scn.nextDouble();

        double v = Math.PI * Math.pow(r, 2) * h;
        return v;
    }

    public static double cone(double r, double h){
        System.out.println("--Right Circular Cone Volume--");

        System.out.println("Enter radius: ");
        r = scn.nextDouble();

        System.out.println("Enter height: ");
        h = scn.nextDouble();

        double v = (Math.PI * Math.pow(r, 2.0) * h)/3.0;
        return v;
    }

    public static double pyramid(double s, double h){
        System.out.println("--Right Square Pyramid--");

        System.out.println("Enter base side length: ");
        s = scn.nextDouble();

        System.out.println("Enter height: ");
        h = scn.nextDouble();

        double v = (Math.pow(s, 2) * h)/3;
        return v;
    }

    public static void main(String[] args){
        double a = 0,b = 0,c = 0;

        System.out.println("1\t Volume of a Cube");
        System.out.println("2\t Volume of a Rectangular Prism");
        System.out.println("3\t Volume of a Sphere");
        System.out.println("4\t Volume of a Right Circular Cylinder");
        System.out.println("5\t Volume of a Right Circular Cone");
        System.out.println("6\t Volume of a Right Square Pyramid");

        System.out.println("Please enter your choice: ");

        int choice = scn.nextInt();

        switch (choice){
            case 1: System.out.println("Volume: " + cube(a));
            break;
            case 2: System.out.println("Volume: " + rect(a,b,c));
            break;
            case 3: System.out.println("Volume: " + sphere(a));
            break;
            case 4: System.out.println("Volume: " + cylinder(a,b));
            break;
            case 5: System.out.println("Volume: " + cone(a,b));
            break;
            case 6: System.out.println("Volume: " + pyramid(a,b));
            break;

            default: System.out.println("Invalid choice");
        }
    }
}
