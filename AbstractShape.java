public abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor to initialize common attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
