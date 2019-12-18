package MethodOverriding;

import java.util.Scanner;

public class BankAccount {
    double balance;
    long accountNumber;
    String name;

    public void info ()
    {
        System.out.println("Name: "  + this.name);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void transfer (double transfer){
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the transfer amount: ");
        //transfer = scanner.nextDouble();
        System.out.println("Money are transferred" + transfer);
        this.balance-=transfer;
        this.balance -= transfer*0.1;
    }

    public void deposit (double deposit) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the deposit amount: ");
        //deposit = scanner.nextDouble();
        System.out.println("Money are deposited" + deposit);
        this.balance = this.balance + deposit;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + this.balance +
                ", accountNumber=" + this.accountNumber +
                ", name='" + this.name + '\'' +
                '}';
    }
}