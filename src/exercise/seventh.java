package exercise;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        double a = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double b = input.nextDouble();
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Remainder: " + (a%b));
    }
}