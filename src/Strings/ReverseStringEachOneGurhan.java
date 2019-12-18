package Strings;

import java.util.Scanner;

public class ReverseStringEachOneGurhan {
    public static void main(String[] args) {
        System.out.println("Please enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] arr = sentence.split(" ");
        for (String rra : arr) {
            for (int j = rra.length()-1; j >= 0; j--) {
                System.out.print(rra.charAt(j));
            }
            System.out.print(" ");
        }
    }
}