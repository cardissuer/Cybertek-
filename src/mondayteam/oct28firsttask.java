package mondayteam;

import java.util.Scanner;

public class oct28firsttask {
    public static void main(String[] args) {

        //Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
        //
        //Example:
        //Input:
        //6
        //Output:
        //0 1 1 2 3 5

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = input.nextInt();
        int first=0;
        int second = 1;
        int result = 0;

        for (int i=0;i<n;i++) {
            System.out.print(first + " ");
            result = first + second;
            first = second;
            second = result;
        }
    }
}
