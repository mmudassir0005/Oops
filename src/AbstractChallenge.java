abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class Circle4 extends Shape{
    public double radius;
    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle4 extends Shape {
    public double length;
    public double breadth;

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }

    double area() {
        return length * breadth;
    }
}
    public class AbstractChallenge {
        public static void main(String[]args){
            Shape s1 = new Rectangle4();
            ((Rectangle4)s1).length = 10;
            ((Rectangle4)s1).breadth = 11;
            System.out.println("Rectangle Area: " + s1.area());
            System.out.println("Rectangle Perimeter: " + s1.perimeter());

            // Using Circle
            Shape s2 = new Circle4();
            ((Circle4)s2).radius = 7;
            System.out.println("Circle Area: " + s2.area());
            System.out.println("Circle Perimeter: " + s2.perimeter());
        }
}
