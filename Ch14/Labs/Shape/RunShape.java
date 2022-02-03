package Ch14.Labs.Shape;

public class RunShape {
    public static void main(String args[]){
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(1,1);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
    }
}