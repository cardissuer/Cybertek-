package IfElseStatements;

import java.util.Scanner;

public class Calculate {
    private static Object equals;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Please choose operator from options below +, -, *, /");
        String symbol = input.next();
        if (symbol.equals ("+")) {

            System.out.println("The result is " + num1 + symbol+ num2 + " = " + (num1+num2));
        }
        else if (symbol.equals ("-")) {
            System.out.println("The result is " + num1 + symbol + num2 + " = " + (num1-num2));
        }
        else if (symbol.equals ("*")) {
            System.out.println("The result is " + num1 + symbol + num2 + " = " + (num1*num2));
        }
        else if (symbol.equals ("/")) {
            System.out.println("The result is " + num1 + symbol + num2 + " = " + (num1/num2));
        }
        else {
            System.out.println ("Invalid operator, please try again");
        }
    }
}
