// Basic class demonstrating different types of constructors
class Person {
    private String name;
    private int age;
    private String city;
    
    // 1. No-argument constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Not specified";
        System.out.println("No-argument constructor called");
    }
    
    // 2. Parameterized constructor with all fields
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. Parameterized constructor with partial fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Not specified";
        System.out.println("Partial parameterized constructor called");
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

// Example class showing constructor chaining
class Student {
    private String name;
    private int rollNumber;
    private String grade;
    
    // Constructor chaining using this()
    public Student() {
        this("Unknown Student", 0, "Not Assigned");
    }
    
    public Student(String name) {
        this(name, 0, "Not Assigned");
    }
    
    public Student(String name, int rollNumber) {
        this(name, rollNumber, "Not Assigned");
    }
    
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    
    public void displayStudent() {
        System.out.println("Student: " + name + ", Roll: " + rollNumber + ", Grade: " + grade);
    }
}

// Main class to demonstrate constructor usage
public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Person Class Examples ===");
        
        // Using no-argument constructor
        Person person1 = new Person();
        person1.displayInfo();
        
        // Using parameterized constructor (all fields)
        Person person2 = new Person("Alice", 25, "New York");
        person2.displayInfo();
        
        // Using parameterized constructor (partial fields)
        Person person3 = new Person("Bob", 30);
        person3.displayInfo();
        
        System.out.println("\n=== Student Class Examples (Constructor Chaining) ===");
        
        // Using different constructors with chaining
        Student student1 = new Student();
        student1.displayStudent();
        
        Student student2 = new Student("Charlie");
        student2.displayStudent();
        
        Student student3 = new Student("Diana", 101);
        student3.displayStudent();
        
        Student student4 = new Student("Eve", 102, "A+");
        student4.displayStudent();
    }
}