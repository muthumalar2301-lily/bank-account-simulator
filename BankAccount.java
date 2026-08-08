public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✓ ₹" + amount + " deposited successfully!");
        } else {
            System.out.println("✗ Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("✗ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("✗ Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("✓ ₹" + amount + " withdrawn successfully!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\n========== ACCOUNT DETAILS ==========");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance        : ₹%.2f%n", balance);
        System.out.println("=====================================");
    }
}