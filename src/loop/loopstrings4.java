package loop;

import java.util.Scanner;

public class loopstrings4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the word");
            String word = input.nextLine();
            String rev = "";
            for (int i=word.length()-1;i>=0;i-=1) {
                rev+= word.charAt(i);
        }
        System.out.println(rev);
    }
}
