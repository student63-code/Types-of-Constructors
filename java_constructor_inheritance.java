// Parent class demonstrating constructor behavior in inheritance
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    
    // Default constructor for Vehicle
    public Vehicle() {
        System.out.println("Vehicle default constructor called");
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    
    // Parameterized constructor for Vehicle
    public Vehicle(String make, String model, int year) {
        System.out.println("Vehicle parameterized constructor called");
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle: " + year + " " + make + " " + model);
    }
}

// Child class extending Vehicle
class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    
    // Default constructor - automatically calls parent's default constructor
    public Car() {
        // Even though we don't see it, Java automatically inserts super() here
        // super(); // This is implicit - Java adds it automatically
        System.out.println("Car default constructor called");
        this.numberOfDoors = 4; // Default to 4 doors
        this.fuelType = "Gasoline"; // Default fuel type
    }
    
    // Constructor that explicitly calls parent constructor with super()
    public Car(String make, String model, int year, int doors, String fuel) {
        // Explicitly call the parent constructor with parameters
        // This MUST be the first statement if used
        super(make, model, year);
        System.out.println("Car parameterized constructor called");
        this.numberOfDoors = doors;
        this.fuelType = fuel;
    }
    
    // Constructor demonstrating flexibility in parent constructor calls
    public Car(String make, String model, int year) {
        // Call parent constructor, but use default values for car-specific attributes
        super(make, model, year);
        System.out.println("Car partial constructor called");
        this.numberOfDoors = 4; // Default value
        this.fuelType = "Gasoline"; // Default value
    }
    
    // Method to display complete car information
    public void displayCarInfo() {
        displayVehicleInfo(); // Call parent method
        System.out.println("Doors: " + numberOfDoors + ", Fuel: " + fuelType);
    }
}

// Another child class to show different inheritance patterns
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineCC;
    
    // Constructor that must call parent constructor
    public Motorcycle(String make, String model, int year, int engineCC) {
        super(make, model, year); // Explicit call to parent constructor
        System.out.println("Motorcycle constructor called");
        this.engineCC = engineCC;
        this.hasSidecar = false; // Default to no sidecar
    }
    
    // Constructor with all motorcycle-specific options
    public Motorcycle(String make, String model, int year, int engineCC, boolean hasSidecar) {
        super(make, model, year);
        System.out.println("Motorcycle full constructor called");
        this.engineCC = engineCC;
        this.hasSidecar = hasSidecar;
    }
    
    public void displayMotorcycleInfo() {
        displayVehicleInfo();
        System.out.println("Engine: " + engineCC + "cc, Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Demonstration class
public class ConstructorInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Creating a default car:");
        System.out.println("=".repeat(30));
        Car car1 = new Car();
        car1.displayCarInfo();
        
        System.out.println("\n" + "Creating a specific car:");
        System.out.println("=".repeat(30));
        Car car2 = new Car("Toyota", "Camry", 2023, 4, "Hybrid");
        car2.displayCarInfo();
        
        System.out.println("\n" + "Creating a partial car:");
        System.out.println("=".repeat(30));
        Car car3 = new Car("Honda", "Civic", 2022);
        car3.displayCarInfo();
        
        System.out.println("\n" + "Creating a motorcycle:");
        System.out.println("=".repeat(30));
        Motorcycle bike1 = new Motorcycle("Harley-Davidson", "Sportster", 2023, 883);
        bike1.displayMotorcycleInfo();
        
        System.out.println("\n" + "Creating a motorcycle with sidecar:");
        System.out.println("=".repeat(30));
        Motorcycle bike2 = new Motorcycle("BMW", "R1250GS", 2023, 1254, true);
        bike2.displayMotorcycleInfo();
    }
}