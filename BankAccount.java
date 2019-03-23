package com.company;
import java.util.Scanner;

public class BankAccount {
    public static void deposit(int total) {
       // float total = 10;
        System.out.print("Amount to deposit: ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();

        if (amount <= 0) {
            System.out.println("Can't deposit nonpositive amount.");
        }
        else {
            total += amount;
            System.out.println("$" + amount + " has been deposited.");
            System.out.println("your total is $" + total);
        }
    }

    public static void withdraw() {
        float total = 10 ;
        System.out.print("Amount to withdraw: ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();

        if (amount <= 0 || amount > total) {
            System.out.println("Withdrawal can't be completed.");
        }
        else {
            total -= amount;
            System.out.println("$" + amount + " has been withdrawn.");
        }
    }

    public static void balance() {
     //   System.out.println("Your balance: $" + total);
    }

}
