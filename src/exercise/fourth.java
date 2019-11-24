package exercise;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter true or false: ");
        boolean a = input.nextBoolean();
        boolean opposite = a==false;
        System.out.println("Here's the opposite: " + opposite);
        System.out.println("Once again: " + !a);
    }
}
