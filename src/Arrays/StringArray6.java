package Arrays;

import java.util.Scanner;

public class StringArray6 {
    public static void main(String[] args) {
        //Read the String from the user using Scanner
        // and print out the players that contains the entered String keyword by user.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = input.nextLine();
        String[] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        for (int i=0; i < names.length; i++ ) {
            if (names[i].toLowerCase(). contains(word)){
                System.out.println(names[i]);
            }
        }
    }
}