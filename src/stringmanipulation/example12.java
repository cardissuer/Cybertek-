package stringmanipulation;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter word:");
        String word = input.nextLine();
        System.out.println("Word length is " + (word.length()) + " and first character is: " + word.charAt(0));
    }
}
