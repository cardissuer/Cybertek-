package repl;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //Write a program that prompts the user to input an integer and
        // then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String res = "";
        for (int i=1;i<=num.length();i++) {
            res+= num.charAt(num.length()-i);
        }
        System.out.print("Reverse of " + num + " is " + (res));
    }
}