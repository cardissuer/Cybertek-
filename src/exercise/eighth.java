package exercise;

import java.util.Scanner;

public class eighth {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a whole number from 1 to 99: ");
//        int change, remain, quarters, dimes, nickels, pennies;
//        change = input.nextInt();
//        remain = change;
//        quarters = change/25;
//        remain = remain%25;
//        dimes = remain/10;
//        remain = remain%10;
//        nickels = remain/5;
//        remain = remain%5;
//        pennies = remain;
//
//        System.out.println("Your change of " + change + " was converted to: ");
//        System.out.println("quarters: " + quarters);
//        System.out.println("dimes: " + dimes);
//        System.out.println("nickels: " + nickels);
//        System.out.println("pennies: " + pennies);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 digits: ");
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int diff = 0;
        if (digit1>digit2){
        diff = digit1-digit2;
            System.out.println("First digit " + digit1 + " is more than " + digit2 + " for " + diff);
        } if (digit1==digit2){
            System.out.println("First digit " + digit1 + " is equal to " + digit2);
        } if (digit1<digit2)
            diff = digit2-digit1;
        System.out.println("First digit " + digit1 + " is less than " + digit2 + " for " + diff);
    }
}
