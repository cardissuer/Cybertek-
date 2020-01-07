package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        try{
            System.out.println("Please enter number one");
            num1 = scanner.nextInt();
            System.out.println("Please enter number two");
            num2 = scanner.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }catch (Exception e){
            System.out.println("One of the numbers was invalid");
        }
        }
    }
