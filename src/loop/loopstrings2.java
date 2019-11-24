package loop;

import java.util.Scanner;

public class loopstrings2 {
    public static void main(String[] args) {
        for (int attempts=0; ;attempts+=1) {
            if (attempts == 3) {
                System.out.println("Your account is locked");
                break;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the password");
            String pswd = input.nextLine();
            if(pswd.equals("secret478")) {
                System.out.println("Welcome to the profile!");
                break;
            } else
                continue;
        }
    }
}
