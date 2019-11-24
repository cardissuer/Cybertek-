package Strings;

import java.util.Scanner;

public class Scrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String txt = input.nextLine();
        String word = "java";
        char c = word.charAt(3);
        char a = txt.charAt(3);
        System.out.println(c);
        System.out.println(a);
    }
}
