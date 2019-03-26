
package com.company;

// import scanner and date objects
import java.util.Scanner;
import java.util.Date;

/*
create New class bank account
declare and initiate variables
*/
public class BankAccount {
    String userName = "Steve";
    double balance = 0;
    String customerId = "Mo Money";

/*
create method for account info
instantiate date object
*/
public void account(){
        Date date = new Date();

// output user info
        System.out.println("User Name:  " + userName);
        System.out.println("CustomerId:  " + customerId);
        System.out.println("Your balance as of " + date.toString() + "  is: $ " + balance );

    }

// create method for user menu
    public  void showMenu(){

// declare and initialize local variables
        int userChoice;
        boolean quit = false;
        int amount = 0;

// Output user menu
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.print("Your choice, 0 to quit: ");

// create a scanner object
            Scanner in = new Scanner(System.in);
            userChoice = in.nextInt();

// switch case statement to call methods
            switch (userChoice) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    amount  = in.nextInt();
                    deposit(amount);
                    break;
                case 2:
                    System.out.print("Amount to withdraw: ");
                    amount  = in.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    getBalance(balance);
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;

            }
            System.out.println();
        } while (!quit);
        System.out.println("Visit again!");
    }

// create method for deposits
    public  void deposit( int amount) {
/*
perform check for positive deposit
add amount of deposit to balance total and print output
*/
        if (amount <= 0) {
            System.out.println("Can't deposit nonpositive amount.");
        }
        else {
            balance += amount;
            System.out.println("$" + amount + " has been deposited.");
            System.out.println("Your new total is: $" + balance);
        }
    }

// create method to withdraw funds
    public  void withdraw(int amount) {
/*
perform check for sufficient funds
subtract amount from current balance
print new balance output
*/
        System.out.println("Your previous balance: $" + balance);
        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient Funds.");
        }
        else {
            balance -=  amount;
            System.out.println("$" + amount + " has been withdrawn.");
            System.out.println("Your new balance is:  $" + balance);
        }
    }

    /*
    create method for getting balance
    instantiate date object
    output date and balance.
    */
    public  void getBalance(double total) {
        Date date = new Date();
        System.out.println("Your balance as of " + date.toString() + " is: $ " + balance );

    }

}


