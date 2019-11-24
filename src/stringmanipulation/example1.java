package stringmanipulation;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String enter = input.nextLine();
        String word = "Cybertek is located in Des Plaines";
        System.out.println(enter + " starts at " + (word.indexOf(enter)));
    }
}
