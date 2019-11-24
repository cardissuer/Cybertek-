package repl;

import java.util.Scanner;

public class PowerOfAnother {
    public static void main(String[] args) {

        //Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to the power of another.
        // (Do not use Java built-in method)
        //
        //Example:
        //
        //Input:
        //2
        //3
        //
        //Output:
        //8

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int res = num1;
        for (int i=1;i<num2;i++){
            res = res*num1;
        }
        System.out.println("Result:" + (res));
    }
}
