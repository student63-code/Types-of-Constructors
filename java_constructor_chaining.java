public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;
    
    // Most comprehensive constructor - all other constructors will chain to this one
    public BankAccount(String accountNumber, String accountHolder, double balance, String accountType) {
        // This is where the actual initialization logic lives
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        
        // Common initialization logic that applies to all constructors
        System.out.println("Account created for: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
    
    // Constructor with default account type - chains to the main constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        // 'this()' calls another constructor in the same class
        // Must be the first statement in the constructor
        this(accountNumber, accountHolder, balance, "Savings");
        System.out.println("Default account type 'Savings' assigned");
    }
    
    // Constructor with default balance and account type - chains to previous constructor
    public BankAccount(String accountNumber, String accountHolder) {
        // This chains to the 3-parameter constructor above
        this(accountNumber, accountHolder, 0.0);
        System.out.println("Account opened with zero initial balance");
    }
    
    // Minimal constructor - only essential information required
    public BankAccount(String accountHolder) {
        // This chains to the 2-parameter constructor above
        // We'll generate a simple account number
        this("ACC" + System.currentTimeMillis(), accountHolder);
        System.out.println("Auto-generated account number assigned");
    }
    
    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("---------------------------");
    }
    
    // Demonstration of how constructor chaining works
    public static void main(String[] args) {
        System.out.println("Creating account with minimal info:");
        BankAccount account1 = new BankAccount("John Doe");
        account1.displayAccountInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating account with account number:");
        BankAccount account2 = new BankAccount("ACC12345", "Jane Smith");
        account2.displayAccountInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating account with initial balance:");
        BankAccount account3 = new BankAccount("ACC67890", "Bob Johnson", 1000.0);
        account3.displayAccountInfo();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating account with all details:");
        BankAccount account4 = new BankAccount("ACC11111", "Alice Brown", 2500.0, "Checking");
        account4.displayAccountInfo();
    }
}