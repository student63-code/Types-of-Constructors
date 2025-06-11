public class Student {
    private String name;
    private int age;
    
    // Parameterized constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
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
        // Creating objects using parameterized constructor
        // Note: Cannot use default constructor as it's not defined
        Student student1 = new Student("Alice Johnson", 20);
        Student student2 = new Student("Bob Smith", 19);
        Student student3 = new Student("Carol Davis", 21);
        
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println("Student 2:");
        student2.displayInfo();
        
        System.out.println("Student 3:");
        student3.displayInfo();
        
        // Modifying student1 using setter methods
        student1.setName("Alice Brown");
        student1.setAge(22);
        System.out.println("Student 1 (After modification):");
        student1.displayInfo();
        
        // Using getter methods
        System.out.println("Student 2's name: " + student2.getName());
        System.out.println("Student 2's age: " + student2.getAge());
        
        // This would cause a compilation error because no default constructor exists:
        // Student student4 = new Student(); // Error!
    }
}