class AreaCalculator {

    // Area of a square
    public double area(double side) {
        return side * side;
    }

    // Area of a rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of a circle
    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Area of a triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }
}

public class Calcoverloading {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of square: " + calc.area(5.0));
        System.out.println("Area of rectangle: " + calc.area(4.5, 6.5));
        System.out.println("Area of circle: " + calc.area(3.0f));
        System.out.println("Area of triangle: " + calc.area(4.0, 5.0, true));
    }
}
