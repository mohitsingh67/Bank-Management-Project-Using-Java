

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    public void applyInterest() {
        System.out.println("Interest not applicable for base Account.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    private final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest ₹" + interest + " added to Savings Account.");
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void applyInterest() {
        System.out.println("No interest for Checking Account.");
    }
}

public class BankOOP {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== Bank Management System ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Balance");
            System.out.println("5. Apply Interest");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performDeposit();
                case 3 -> performWithdraw();
                case 4 -> performDisplay();
                case 5 -> performInterest();
                case 6 -> {
                    System.out.println("Exiting system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter Account Type (savings/checking): ");
        String type = scanner.nextLine().toLowerCase();

        Account acc;
        if (type.equals("savings")) {
            acc = new SavingsAccount(accNo, name, balance);
        } else if (type.equals("checking")) {
            acc = new CheckingAccount(accNo, name, balance);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        accounts.add(acc);
        System.out.println("Account created successfully.");
    }

    static Account findAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    static void performDeposit() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amt = scanner.nextDouble();
            scanner.nextLine();
            acc.deposit(amt);
        } else {
            System.out.println("Account not found.");
        }
    }

    static void performWithdraw() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amt = scanner.nextDouble();
            scanner.nextLine();
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found.");
        }
    }

    static void performDisplay() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.displayBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    static void performInterest() {
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.applyInterest();
        } else {
            System.out.println("Account not found.");
        }
    }
}

