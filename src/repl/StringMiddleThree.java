package repl;

import java.util.Scanner;

public class StringMiddleThree {
    public static void main(String[] args) {
        //Ask user to enter a word. If the word has odd number of characters and has 5 or more characters,
        // print the middle three characters of the word.
        //
        //
        //Input:
        //fifteen
        //
        //Output:
        //fte

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scanner.nextLine();
        if (word.length()>=5 && word.length()%2==1) {
            word = word.substring((word.length()/2)-1, (word.length()/2)+2);
            System.out.println(word);
        }else
            System.out.println();
    }
}
