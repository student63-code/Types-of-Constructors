public class Rectangle {
    private double length;
    private double width;
    
    // Default constructor calls parameterized constructor
    public Rectangle() {
        this(1.0, 1.0);  // Must be first statement
    }
    
    // Constructor with one parameter (creates a square)
    public Rectangle(double side) {
        this(side, side);  // Calls two-parameter constructor
    }
    
    // Parameterized constructor with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Getter methods
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    // Method to display rectangle information
    public void displayInfo() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("------------------------");
    }
    
    // Check if it's a square
    public boolean isSquare() {
        return length == width;
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor (creates 1x1 rectangle)
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Constructor):");
        rect1.displayInfo();
        
        // Using single parameter constructor (creates a square)
        Rectangle rect2 = new Rectangle(5.0);
        System.out.println("Rectangle 2 (Square with side 5.0):");
        rect2.displayInfo();
        System.out.println("Is Square: " + rect2.isSquare());
        System.out.println();
        
        // Using parameterized constructor
        Rectangle rect3 = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle 3 (4.0 x 6.0):");
        rect3.displayInfo();
        System.out.println("Is Square: " + rect3.isSquare());
        System.out.println();
        
        // Modifying rectangle using setters
        rect1.setLength(3.0);
        rect1.setWidth(7.0);
        System.out.println("Rectangle 1 (After modification):");
        rect1.displayInfo();
        
        // Using getter methods
        System.out.println("Rectangle 3 dimensions:");
        System.out.println("Length: " + rect3.getLength());
        System.out.println("Width: " + rect3.getWidth());
    }
}