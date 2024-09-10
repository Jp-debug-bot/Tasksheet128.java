public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
