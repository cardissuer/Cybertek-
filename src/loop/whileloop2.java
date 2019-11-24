package loop;

import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        while (name.startsWith("j")) {
            System.out.println("enter your name");
            name = input.nextLine();
        }
    }
}
