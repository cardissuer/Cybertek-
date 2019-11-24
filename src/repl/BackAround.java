package repl;

import java.util.Scanner;

public class BackAround {
    public static void main(String[] args) {

        //Given a string, take the last char and return a new string with the last char added at the front and back,
        // so "cat" yields "tcatt". The original string will be length 1 or more.

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.length()>=1) {
            System.out.println(word.charAt(word.length()-1) + word + word.charAt(word.length()-1));
        } else
            System.out.println();
    }
}
