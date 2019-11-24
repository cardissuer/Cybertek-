package mondayteam;

import java.util.Scanner;

public class oct21thirdtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = input.nextLine();
        word = word.toLowerCase();
        int length = word.length();
        int half = (length/2);
        if ((length%2 == 1) && length > 3 && length <100) {
            String sub1 = word.substring (0,half);
            String sub2 = word.substring(half,half+1);
            sub2 = sub2.toUpperCase();
            String sub3 = word.substring(half+1);
            System.out.println(sub1+sub2+sub3.toLowerCase());
        }else if ((length%2 == 0) && length >3 && length <100) {
            String sub1 = word.substring (0,half-1);
            String sub2 = word.substring(half-1,half+1);
            sub2 = sub2.toUpperCase();
            String sub3 = word.substring(half+1);
            System.out.println(sub1+sub2+sub3.toLowerCase());
        }else
            System.out.println("Invalid enter");
    }
}
