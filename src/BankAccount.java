public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }

    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        }

        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        }

        else {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
        }

    }
}