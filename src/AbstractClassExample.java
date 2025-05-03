// Abstract class
abstract class Vehicle {
    // Concrete method
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Abstract method
    public abstract void fuelType();
}

// Subclass 1
class Car extends Vehicle {
    @Override
    public void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
}

// Subclass 2
class ElectricScooter extends Vehicle {
    @Override
    public void fuelType() {
        System.out.println("Electric Scooter uses battery.");
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();            // Polymorphism
        v1.start();                        // Concrete method from abstract class
        v1.fuelType();                     // Overridden method

        Vehicle v2 = new ElectricScooter(); // Another subclass object
        v2.start();
        v2.fuelType();
    }
}
