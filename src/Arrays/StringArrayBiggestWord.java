package Arrays;

import java.util.Arrays;

public class StringArrayBiggestWord {
    public static void main(String[] args) {
        //"Write a program that creates a group of given size thisisabigword”
        //Find the biggest word in your String and print it.

        String str = "Write a program that creates a group of given size thisisabigworld";
        String [] regular = str.trim().split (" ");
        int biggestlength = 0;
        for (String word: regular) {
            if (word.length() > biggestlength) {
                biggestlength = word.length();
            }
        }
        for (String word: regular) {
            if (word.length() == biggestlength) {
                System.out.println(word);
            }
        }
        System.out.println(Arrays.toString(regular));
        Arrays.sort(regular);
        System.out.println("Max value is " + regular[regular.length-1]);
    }
}
