package stringmanipulation;

import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 strings: ");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        name1 = name1.toLowerCase();
        name2=name2.toLowerCase();
        if(name1.contains(name2)) {
            System.out.println(name2 + " is a substring for " + name1);
        } else
            System.out.println(name2 + " is not a substring for " + name1);
    }
}
