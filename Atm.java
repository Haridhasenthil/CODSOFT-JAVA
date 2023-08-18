package codesoft;1
import java.util.Scanner;
public class Atm {
    private static int balance = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            performOperation(choice, scanner);
        }
    }

    private static void displayMenu() {
        System.out.println("Automated Teller Machine");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an operation: ");
    }

    private static void performOperation(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                withdraw(scanner);
                break;
            case 2:
                deposit(scanner);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your money.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
        System.out.println();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        int amount = scanner.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
        System.out.println();
    }

    private static void checkBalance() {
        System.out.println("Your balance: " + balance);
        System.out.println();
    }

    private static void exit() {
        System.out.println("Thank you for using our ATM. Goodbye!");
        System.exit(0);
    }
}
