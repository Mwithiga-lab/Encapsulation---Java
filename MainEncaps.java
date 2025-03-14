/*
Author:Kevin Mwithiga
Reg No:CT101/G/19870/23
Encapsulation
*/
class BankAccount {
    // Private variable to store the balance
    private double balance;

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance. Cannot withdraw $" + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        }
    }

    // Public method to get the current balance (read-only access)
    public double getBalance() {
        return balance;
    }
}

public class MainEncaps {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount();

        // Deposit money into the account
        account.deposit(1000.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Withdraw money from the account
        account.withdraw(500.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Attempt to withdraw more than the available balance
        account.withdraw(600.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Attempt to deposit a negative amount
        account.deposit(-200.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Attempt to withdraw a negative amount
        account.withdraw(-100.0);
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
