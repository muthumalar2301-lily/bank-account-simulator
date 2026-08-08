import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("       BANK ACCOUNT SIMULATOR");
        System.out.println("=====================================");

        // Create account
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial deposit: ₹");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(
                name,
                accountNumber,
                initialBalance
        );

        System.out.println("\n✓ Account created successfully!");

        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    account.displayDetails();
                    break;

                case 5:
                    System.out.println("\nThank you for using Bank Account Simulator!");
                    break;

                default:
                    System.out.println("✗ Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}