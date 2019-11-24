package repl;

import java.util.Scanner;

public class HWMethodsFindCube {
    //Write a method called cube that asks the user for a number and then prints the cubed value of that number:
    //
    //For example:
    //
    //Input:
    //5
    //
    //Output:
    //125
    //
    //hint:
    //cube of a number n = n*n*n

    public static void main(String[] args) {

        // method
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        cube(n);

    }

    public static void cube(int n) {
        //your code here

        n=n*n*n;
        System.out.println(n);

    }
}

