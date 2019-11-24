package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysprintfirstlastcharII {
    public static void main(String[] args) {
        //Given a String array words, iterate through each word and print first and last letter of each element
        // in the format below.
        //
        //Example:

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String [] words1 = new String[5];
        for (int i=0; i<words.length;i++){
        words1[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);

        }
        System.out.print(Arrays.toString (words1));
    }

}