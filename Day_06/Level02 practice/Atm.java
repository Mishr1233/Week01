
/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
 Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. 
The methods allow interaction with these attributes to modify and view the account's state.
*/

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting user input
        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // ATM Menu
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Select an option (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.display();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize BankAccount
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method with balance check
    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    // Display account information
    void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: $" + this.balance);
    }
}
