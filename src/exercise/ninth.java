package exercise;

import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int one = input.nextInt();
        boolean check = 0 < one && one <= 100;
        System.out.println(check);
    }
}
