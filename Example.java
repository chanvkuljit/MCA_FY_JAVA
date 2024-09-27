// Abstract class Vehicle
abstract class Vehicle {
    String model;
    int year;

    // Constructor of abstract class
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Abstract method
    abstract void displayInfo();
}

// Interface Drivable
interface Drivable {
    void drive();
}

// Car class extends Vehicle and implements Drivable
class Car extends Vehicle implements Drivable {
    int speed;

    // Constructor using 'super' to call the parent constructor
    public Car(String model, int year, int speed) {
        super(model, year);
        this.speed = speed;
    }

    // Implementing abstract method from Vehicle
    @Override
    void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year + ", Speed: " + speed + " km/h");
    }

    // Implementing drive() method from Drivable
    @Override
    public void drive() {
        System.out.println(model + " is driving at " + speed + " km/h.");
    }
}

// Truck class extends Vehicle and implements Drivable
class Truck extends Vehicle implements Drivable {
    int capacity;

    // Constructor using 'this' keyword
    public Truck(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    // Implementing abstract method from Vehicle
    @Override
    void displayInfo() {
        System.out.println("Truck Model: " + model + ", Year: " + year + ", Capacity: " + capacity + " tons");
    }

    // Implementing drive() method from Drivable
    @Override
    public void drive() {
        System.out.println(model + " is hauling " + capacity + " tons.");
    }
}

// Driver class to demonstrate arrays, objects, and methods
public class Driver {

    // Function to demonstrate array of Car objects
    public void demonstrateCarsArray() {
        Car[] cars = new Car[3];  // Array of Car objects
        cars[0] = new Car("Toyota", 2020, 180);
        cars[1] = new Car("Honda", 2018, 170);
        cars[2] = new Car("Ford", 2022, 190);

        for (Car car : cars) {
            car.displayInfo();
            car.drive();
        }
    }

    // Function to demonstrate array of Truck objects
    public void demonstrateTrucksArray() {
        Truck[] trucks = new Truck[2];  // Array of Truck objects
        trucks[0] = new Truck("Volvo", 2019, 15);
        trucks[1] = new Truck("Scania", 2021, 18);

        for (Truck truck : trucks) {
            truck.displayInfo();
            truck.drive();
        }
    }

    public static void main(String[] args) {
        // Creating Driver object to call methods
        Driver driver = new Driver();
        
        System.out.println("Car Array Demonstration:");
        driver.demonstrateCarsArray();  // Calling the method to demonstrate Car array

        System.out.println("\nTruck Array Demonstration:");
        driver.demonstrateTrucksArray();  // Calling the method to demonstrate Truck array
    }
}