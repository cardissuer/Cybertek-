package benazir;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = input.nextLine();
        String word2 = "";
        for (int i = word.length()-1;i>=0; i--) {
            word2 = word2 + word.charAt(i);
        }
        if (word.equalsIgnoreCase(word2)) {
            System.out.println("Palindrome");;
        } else
            System.out.println("Not a palindrome");;
    }
}
