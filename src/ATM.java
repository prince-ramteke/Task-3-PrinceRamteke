import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n=========================");
            System.out.println("        ATM MENU");
            System.out.println("=========================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("=========================");
            System.out.print("Enter Choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please Enter Valid Number!");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    System.out.println("Thank You For Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }

    private void depositMoney() {

        System.out.print("Enter Amount To Deposit: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Enter Valid Amount!");
            scanner.next();
        }

        double amount = scanner.nextDouble();

        account.deposit(amount);
    }

    private void withdrawMoney() {

        System.out.print("Enter Amount To Withdraw: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Enter Valid Amount!");
            scanner.next();
        }

        double amount = scanner.nextDouble();

        account.withdraw(amount);
    }
}