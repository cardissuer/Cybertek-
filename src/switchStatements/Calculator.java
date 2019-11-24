package switchStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter operator and two numbers");
        String c = input.nextLine();
        int a = input.nextInt();
        int b = input.nextInt();

        switch (c) {
            case "+":
                System.out.println((a + " + " + b + " = " + (a+b)));
                break;
            case "-":
                System.out.println((a + " - " + b + " = " + (a-b)));
                break;
            case "*":
                System.out.println((a + " * " + b + " = " + (a*b)));
                break;
            case "/":
                System.out.println((a + " / " + b + " = " + (a/b)));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
