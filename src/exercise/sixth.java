package exercise;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = input.nextInt();
        System.out.println("Please enter the second number: ");
        int b = input.nextInt();
        boolean compare = a==b;
        System.out.println("Here's compare result: " + compare);
    }
}
