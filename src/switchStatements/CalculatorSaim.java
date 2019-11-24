package switchStatements;

import java.util.Scanner;

public class CalculatorSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = input.nextInt();
        System.out.println("Please enter second number");
        double num2 = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the operator");
        String op = input.nextLine();
        double result = 0;
        boolean valid = true;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;;
                break;
            case "*":
                result = num1 * num2;;
                break;
            case "/":
                result = num1 / num2;;
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }
        if (valid) {
            System.out.println(num1 + op + num2 + " = " + result);
        }
    }
}
