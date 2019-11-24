package loop;

import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {
        System.out.println("Please enter the word");
        Scanner input = new Scanner(System.in);
        String n1 = input.nextLine();
        if (n1.startsWith("xx")) {
                System.out.println(n1.substring(2));
            } else if (n1.indexOf("x") == 0) {
                System.out.println(n1.substring(1));
            } else if (n1.indexOf("x") == 1) {
                System.out.println(n1.substring(0, 1) + n1.substring(2));
        } else
            System.out.println(n1);
    }
}