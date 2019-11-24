package repl;
import java.util.Scanner;
public class HWMethodsSimpleCalculator {

    public static void main(String[] args) {

        plus();
    }

    public static void plus() {

        //your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("result: " + (num1 + num2));

    }
}
