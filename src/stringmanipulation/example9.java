package stringmanipulation;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two email addresses");
        String email1 = input.nextLine().trim();
        String email2 = input.nextLine().trim();
        String email = "";
        if (email1.length()>=6 && email2.length()>=6) {
            email = email1.substring(0,4);
            email+=email2.substring(email1.length()-3);
            email+="@cybertek.com";
            System.out.println(email);
        }else
            System.out.println("Invalid data");
            }
}
