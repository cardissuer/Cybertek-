package repl;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        //Write a Java program that takes the user to provide a single character from the alphabet.
        // Print Vowel or Consonant, depending on the user input.
        // If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
        // print an error message (ERROR. It should be exactly 1 character length!).
        //Input:
        //Input an alphabet: b
        //Output :
        //Input letter is Consonant

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = scanner.nextLine ();;
        if (str.length()>1) {
            System.out.println("ERROR. It should be exactly 1 character length!");
        } else
            switch (str) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Input letter is vowel");
                    break;
                default:
                    System.out.println("Input letter is consonant");
            }
    }
}