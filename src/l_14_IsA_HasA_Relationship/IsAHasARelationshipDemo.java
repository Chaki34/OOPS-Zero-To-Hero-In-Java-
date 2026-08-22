package l_14_IsA_HasA_Relationship;

/*

Relationship
IS-A	Inheritance	 Dog IS-A Animal
HAS-A	Association / composition / aggregation	Car HAS-A Engine

*/

public class IsAHasARelationshipDemo {

    // Parent class
    static class Vehicle {
        String brand;

        Vehicle(String brand) {
            this.brand = brand;
        }

        void start() {
            System.out.println(brand + " vehicle is starting...");
        }
    }

    // IS-A Relationship
    // Car IS-A Vehicle
    static class Car extends Vehicle {

        // HAS-A Relationship
        // Car HAS-A Engine
        Engine engine;

        Car(String brand) {
            super(brand);
            engine = new Engine("Petrol");
        }

        void drive() {
            System.out.println(brand + " car is driving...");
        }
    }

    // Separate class
    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }

        void showEngine() {
            System.out.println("Engine type: " + type);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota");

        // IS-A
        car.start();       // Car inherits from Vehicle
        car.drive();

        // HAS-A
        car.engine.showEngine();
    }
}
