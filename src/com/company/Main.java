
/*
** Stephen Scruggs
** program name: bankApp.java
** This program provides a menu of banking options.
 */

package com.company;
import java.util.Scanner;

public class Main {
    public static Integer total;

    public static void main(String[] args) {

        BankAccount stephen = new BankAccount();
        stephen.account();
        stephen.showMenu();

           }
    }
