package Ch14.Labs.Shape;

public class Circle implements Shape {
    private double radius;

    //literally just the circle
    public Circle(double constructRadius) {
        radius = constructRadius;
    }

    //gettin and settin
    public double getRadius() {
        return radius;
    }
    public void setRadius(double constructRadius) {
        radius = constructRadius;
    }

    //radius calculate and return
    public double area() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 2 * 3.24 * radius;
    }
}

