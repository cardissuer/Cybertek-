package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDivideGurhan {
    public static void main(String[] args) {
        System.out.println("Welcome to Divide My Array!");
        System.out.println("Enter the number which will be the size of your array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] numbers = new int[number];
        System.out.println("Enter the numbers of your array: ");
        for (int i=0; i<number; i++){
            numbers [i] = scanner.nextInt();
        }
        System.out.print("The string value of your array is: ");
        System.out.println(Arrays.toString(numbers));
        System.out.print("The first part of your array is: ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers,0,numbers.length/2)));
        System.out.print("The last part of your array is: ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers,numbers.length/2,number)));
    }
}