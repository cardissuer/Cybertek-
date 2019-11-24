package loop;

import java.util.Scanner;

public class loopstrings1 {
    public static void main(String[] args) {
        for ( ; ; ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the password");
            String pswd = input.nextLine();
            if (pswd.equals ("secret478")) {
                System.out.println("Welcome to the profile!");
                break;
            } else
                continue;
        }
    }
}
