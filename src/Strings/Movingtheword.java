package Strings;

import java.util.Scanner;

public class Movingtheword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sent = input.nextLine();
        int space = sent.indexOf(" ");
        String firstWord = sent.substring(0, space);
        String reamin = sent.substring(space + 1);
        System.out.println(reamin + " " + firstWord);
    }
}
