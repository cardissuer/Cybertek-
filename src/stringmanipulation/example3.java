package stringmanipulation;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String nam = input.nextLine();
        String name = nam.toLowerCase();
        if(name.startsWith("a") || name.startsWith("z")) {
            System.out.println("Cool name");
        }else
            System.out.println("Not a cool name");
    }
}
