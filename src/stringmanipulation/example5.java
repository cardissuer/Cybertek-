package stringmanipulation;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two words to compare");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        if(word1.compareTo(word2)<0) {
            System.out.println(word1);
        } else if(word1.compareTo(word2) == 0) {
            System.out.println("Sorry, these words are equal");
        } else
            System.out.println(word2);
    }
}
