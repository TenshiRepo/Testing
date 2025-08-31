// Superclass: Vehicle
class Vehicle {
    protected String brand;
    int price;

    // Constructor
    Vehicle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Vehicle(){
        this("Toyota", 5000000);
    }

    Vehicle(int price){
       this("Misubb", price);
    }
    void displayDetails(){
        System.out.println(brand + " " + price);
    }

    // Method to be overridden
    public void honk() {
        System.out.println("Vehicle honks");
    }

    // Overloaded method
    public void displayDetails(String color) {
        System.out.println("Brand: " + brand + ", Color: " + color);
    }

    // Overloaded method
    public void displayDetails(String color, int wheels) {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Wheels: " + wheels);
    }
}

// Subclass: Car
class Car extends Vehicle {
    public Car(String brand, int price) {
        super(brand, price);
    }

    Car(int price){
        this("Jeep", price);
    }

    // Method overriding
    @Override
    public void honk() {
        System.out.println("Car beeps");
    }

    // Additional method
    public void lockDoors() {
        System.out.println("Car doors locked");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int price) {
        super(brand,price);
    }

    // Method overload
    public void honk(String type) {
        System.out.println( type + " honks loudly" );
    }

    // Additional method
    public void kickStart() {
        System.out.println("Motorcycle kick-started");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    public Truck(String brand, int price) {
        super(brand, price);
    }

    // Method overriding
    @Override
    public void honk() {
        System.out.println("Truck honks loudly");
    }

    // Additional method
    public void loadCargo() {
        System.out.println("Truck loaded with cargo");
    }
}

public class Midterm {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 50000);
        Motorcycle motorcycle = new Motorcycle("Honda", 800000);
        Truck truck = new Truck("Ford", 7000000);
        Vehicle vehicle = new Vehicle(900000);
        Vehicle v1 = new Vehicle();
        
        // Method overriding demonstration
        car.honk();     // Output: Car beeps
        motorcycle.honk(); // Output: Motorcycle honks loudly
        truck.honk();     // Output: Truck honks loudly

        // Method overloading demonstration
        car.displayDetails("Red"); // Output: Brand: Toyota, Color: Red
        truck.displayDetails("Blue", 6); // Output: Brand: Ford, Color: Blue, Wheels: 6
        car.displayDetails();

        // Additional methods
        car.lockDoors(); // Output: Car doors locked
        motorcycle.kickStart(); // Output: Motorcycle kick-started
        truck.loadCargo(); // Output: Truck loaded with cargo

        vehicle.displayDetails();
        v1.displayDetails();

        v1.displayDetails("Red");
        motorcycle.honk("Motor");
        motorcycle.displayDetails(null, 0);
        
    }
}