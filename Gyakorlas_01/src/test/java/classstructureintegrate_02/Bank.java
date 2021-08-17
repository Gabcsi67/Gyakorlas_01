package classstructureintegrate_02;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
       /* System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String owner= scanner.nextLine();

        System.out.println("How much money you got?");
        int balance = scanner.nextInt();

        System.out.println("What is your Account number?");
        String accountNumber = scanner.nextLine();*/

        BankAccount bank = new BankAccount("","", 0 );
        bank.createAccount();
        /*System.out.println(bank.getInfo());
        bank.deposit(5);
        System.out.println(bank.getInfo());
        bank.withdraw(120);
        System.out.println(bank.getInfo());*/
        BankAccount anotherbank = new BankAccount("","",0);
        anotherbank.createAccount();
        System.out.println(bank.getInfo());
        System.out.println(anotherbank.getInfo());
        bank.transfer(anotherbank,5);
        System.out.println(bank.getInfo());
        System.out.println(anotherbank.getInfo());
    }
}
