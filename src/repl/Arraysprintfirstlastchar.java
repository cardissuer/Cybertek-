package repl;

import java.util.Scanner;

public class Arraysprintfirstlastchar {
    public static void main(String[] args) {
        //Given a String array words, iterate through each word and print first and last letter of each element
        // in separate lines.
        //
        //Example:

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
String [] newords = new String[5];
for (int i=0;i<words.length;i++){
    newords[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
    System.out.println(newords[i]);
}

    }
}
