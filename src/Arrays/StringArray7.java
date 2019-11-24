package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray7 {
    public static void main(String[] args) {

        //Write a program that asks the number of cars user has and create an array of String with given size.
        // Then ask the user to enter each car. After getting all the cars, print the array.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter cars number");
        int size = scanner.nextInt();
        scanner.nextLine();
        String [] names = new String[size];
        for (int i=0;i<names.length;i++) {
            System.out.println("Please enter name " + (i+1));
            names [i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
