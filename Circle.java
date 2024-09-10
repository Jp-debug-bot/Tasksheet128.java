public class Circle extends AbstractShape {
    double radius;

    // Constructor to initialize color and radius
    public Circle(String color, double radius) {
        super(color, 0, 0); // Passing dummy values for length and width
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
