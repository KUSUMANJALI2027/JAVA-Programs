class BankAccount {
    private double balance;

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(-500); // Invalid deposit
    }
}