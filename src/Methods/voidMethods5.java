package Methods;

import java.util.Scanner;

public class voidMethods5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some String: ");
        String name = input.nextLine();
        countWords (name);
    }
    public static void countWords (String name) {
        String [] numberOfWords = name.trim().split(" ");
        System.out.println("The number of words in the sentence is: " + numberOfWords.length);
        }
    }
