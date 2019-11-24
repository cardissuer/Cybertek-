package repl;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //Write a program to find the factorial value of any number entered through the keyboard.
        //
        //
        //Example:
        //
        //Input:
        //5
        //Output:
        //Factorial: 120

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact = 1;
        for (int i=2;i<=num;i++) {
            fact = fact*i;
        }
        System.out.println("Factorial: " + (+fact));
    }
}
