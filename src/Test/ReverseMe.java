package Test;

import java.util.Scanner;

public class ReverseMe {
    public static void main (String [] jesus){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter new word");
        String word = scanner.nextLine();
        String reverse = "";

        for (int i=word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
