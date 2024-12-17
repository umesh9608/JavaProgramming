/* . Bank Account Management
 Problem Description:
o Create a BankAccount class with attributes such as accountNumber,
accountHolderName, and balance. Implement methods to deposit money,
withdraw money, and check the balance. Create multiple BankAccount objects
and perform various transactions (like deposit and withdrawal). Display the
final balance for each account.
 Solution Approach:
o Start by defining the BankAccount class with the required attributes and
methods. Use a loop or individual calls to simulate transactions
(deposit/withdrawal) for each account. Finally, print out the account details
and balance.
 Test Cases:
1. Test Case 1:
 Input: Deposit 5000, Withdraw 2000.
 Expected Outcome: Final balance = 3000.
2. Test Case 2:
 Input: Deposit 10000, Withdraw 15000.
 Expected Outcome: Error message (Insufficient balance).
3. Test Case 3:
 Edge Case: Initial balance = 0, Withdraw 100.
 Expected Outcome: Error message (Insufficient balance).
4. Test Case 4:
 Edge Case: Deposit 0.
 Expected Outcome: Balance remains unchanged.
5. Test Case 5:
 Input: Multiple deposits and withdrawals.
 Expected Outcome: Final balance reflects all transactions accurately.
 */
package Assignment12;
import java.util.Scanner;
class BankAccount {
    String accountNumber;       // Attributes
    String accountHolderName;
    double balance;
    // Constructor to initialize the account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Add the amount to the balance
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Method to withdraw money
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Subtract the amount from the balance
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get account details from the user
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a BankAccount object
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawal(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    account.display();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Exiting... Final account details:");
        account.display();
    }
}


//ager koi fun class ke ander ho ho to wo method hota hai
//obj is the variable of class