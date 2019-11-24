package Strings;

import java.util.Scanner;

public class secondtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter account number");
        String num = input.nextLine();
        String firstNumber = num.substring(0, 1);
        boolean invalid = firstNumber.equals("5") || firstNumber.equals("2");
        if (invalid) {
            System.out.println("Invalid account number");
        } else {
            if (firstNumber.equals("5")) {
                if (num.length() == 10) {
                    System.out.println("Valid 5 account");
                } else {
                    System.out.println("Invalid account number");
                }
            }
        }
    }
}
