package exercise;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        int a = input.nextInt();
        System.out.println("Please enter the second name: ");
        int b = input.nextInt();
        boolean c = a > b;
        System.out.println(c);
    }
}
