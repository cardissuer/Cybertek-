package Strings;

import java.util.Scanner;

public class ReverseStringGurhan {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String reversed = "";
        for (int i=sentence.length()-1; i>=0;i--){
            reversed = reversed + sentence.charAt(i);
        }
        System.out.println(reversed);
        System.out.println(reverseMethod("jungle boogie"));
    }

    public static String reverseMethod (String word){
        String reverseWord = "";
        for (int i=word.length()-1;i>=0;i--){
            reverseWord += word.charAt(i);
        }
        return reverseWord;
    }
}
