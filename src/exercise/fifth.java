package exercise;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first character: ");
        char one = input.nextLine().charAt(0);
        System.out.println("Please enter second character: ");
        char two = input.nextLine().charAt(0);
        boolean three = one > two;
        System.out.println(three);
        System.out.println(one > two);
    }
}
