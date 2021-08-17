package classstructureintegrate_02;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(int depo) {
        this.balance = depo + balance;

    }

    public void withdraw(int draw) {
        this.balance = balance - draw;

    }


    public void createAccount() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String owner = scanner.nextLine();

        System.out.println("What is your Account number?");
        String accountNumber = scanner.nextLine();

        System.out.println("How much money you got?");
        int balance = scanner.nextInt();

        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void transfer(BankAccount bankAccount, int amount) {
        this.balance = balance - amount;
        bankAccount.balance = bankAccount.balance + amount;
    }

    public String getInfo() {
        return "Owner: " + owner + " Account Number: " + accountNumber + " Balance: " + balance + " Ft";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }


}
