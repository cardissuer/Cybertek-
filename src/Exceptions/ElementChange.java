package Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ElementChange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the index you want to change");
            int index = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter new digit you want to change this element to");
            int newDigit = scanner.nextInt();
            scanner.nextLine();
            arr[index] = newDigit;
        }catch (InputMismatchException e){
            System.out.println("The digit is invalid");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }finally {
            System.out.println(Arrays.toString(arr));
        }
    }
}