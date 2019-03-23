package com.company;
import java.util.Scanner;

public class Main {
    public static Integer total;

    public static void main(String[] args) {
        if (total == null) {
            total = 10;
        }
      //  float total = 10;
        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        int total = 10;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.print("Your choice, 0 to quit: ");
            userChoice = in.nextInt();
            switch (userChoice) {
                case 1:
                    BankAccount.deposit(total);
                    break;
                case 2:
                    BankAccount.withdraw();
                      break;
                case 3:
                    BankAccount.balance();
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

        return total;
    }
    }

