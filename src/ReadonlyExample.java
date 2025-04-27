class Circle {
    private final double pi = 3.14159;  // private and final (optional)

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    // Only getter for pi (read-only)
    public double getPi() {
        return pi;
    }

    // Getter and Setter for radius (normal property)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double area() {
        return pi * radius * radius;
    }
}

public class ReadonlyExample {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Pi: " + c.getPi());         // We can READ pi
        System.out.println("Area: " + c.area());

        // c.pi = 3.14;   ❌ Not allowed (pi is private and has no setter)
    }
}