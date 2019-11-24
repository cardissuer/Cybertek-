package IfElseStatements;

import javax.swing.*;
import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        int passCode = 3241;

        /*Write a program that asks to enter 4 digit integer via scanner
        compare the passcode
        if it's valid print "Welcome to the IPhone"
        if not print "Try again"
        Check the special case;
        check for negative numbers. If entered password is negative, print "No negative numbers"
        passcode must be only 4 digits
        If more than 4 digits you must print "You entered more digits"
        If less than 4 digits you must print "You entered less digits"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your passcode: ");
        int code = input.nextInt();
        if (code == passCode) {
            System.out.println("Welcome to IPhone");
        }
        else if (code < 0) {
            System.out.println("No negative numbers");
        }
        else if (code > 9999) {
            System.out.println("You have entered more digits");
        }
        else if (code < 1000){
            System.out.println("You have entered less digits");
        }
        else {
            System.out.println("Wrong password!Try again");
        }
    }
}
