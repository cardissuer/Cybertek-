package stringmanipulation;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message");
        String msg = input.nextLine();
        String check = msg;
        check = check.replace("idiot", "smart");
        check = check.replace("dumb", "smart");
        check = check.replace("stupid", "smart");
        if (msg.equalsIgnoreCase(check)) {
            System.out.println("Your message was not changed");
            System.out.println(msg);
        }else {
            System.out.println("Your bad words were removed");
            System.out.println(check);
        }
    }
}

