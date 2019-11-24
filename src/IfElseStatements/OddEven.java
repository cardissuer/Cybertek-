package IfElseStatements;

import java.util.Scanner;

 public class OddEven {
    public static void main(String[] args) {

        // this program defines if the number is odd or even

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter any number: ");
        int num = input.nextInt();

        if (num%2 == 0) {
            System.out.println("This is even number");
        }
        else {
            System.out.println("This is odd number");
        }
    }
}
