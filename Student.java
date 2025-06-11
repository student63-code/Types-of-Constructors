 public class Student {
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating object using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        student1.displayInfo();
        
        // Creating object using parameterized constructor
        Student student2 = new Student("Alice Johnson", 20);
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.displayInfo();
        
        // Modifying student1 using setter methods
        student1.setName("Bob Smith");
        student1.setAge(19);
        System.out.println("Student 1 (After modification):");
        student1.displayInfo();
        
        // Using getter methods
        System.out.println("Student 2's name: " + student2.getName());
        System.out.println("Student 2's age: " + student2.getAge());
    }
}


