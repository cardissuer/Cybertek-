package w3resource;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String sent = input.nextLine();
        System.out.println("Enter the index of a character");
        int index = input.nextInt();
        System.out.println("The character at position " + index + " is " + sent.charAt(index));
    }
}
