package Ch14.Labs.Shape;

public class Rectangle implements Shape {
    private double length;
    private double width;

    //constructor I think?
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double Length() {
        return length;
    }

    public double Width(double width) {
        width = width;
        return width;
    }

    public double perimeter() {
        return 2 * (length+width);
    }
    public double area() {
        return length * width;
    }
}
