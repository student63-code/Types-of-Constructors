public class Student {
    // Instance variables that will be initialized by constructors
    private String name;
    private int age;
    private String studentId;
    
    // Default constructor - takes no parameters
    public Student() {
        // Initialize with default values
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "Not Assigned";
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor - takes specific values
    public Student(String name, int age, String studentId) {
        // Initialize with provided values
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        System.out.println("Parameterized constructor called for: " + name);
    }
    
    // Another parameterized constructor - demonstrates constructor overloading
    public Student(String name, int age) {
        // Initialize name and age, but set default studentId
        this.name = name;
        this.age = age;
        this.studentId = "TBD"; // To Be Determined
        System.out.println("Two-parameter constructor called for: " + name);
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + studentId);
    }
    
    // Main method to demonstrate constructor usage
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.displayInfo();
        
        System.out.println(); // Empty line for clarity
        
        // Using parameterized constructor with all parameters
        Student student2 = new Student("Alice Johnson", 20, "STU001");
        student2.displayInfo();
        
        System.out.println(); // Empty line for clarity
        
        // Using parameterized constructor with two parameters
        Student student3 = new Student("Bob Smith", 19);
        student3.displayInfo();
    }
}