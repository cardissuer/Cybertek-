package exercise;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------
        if (n1.startsWith("x")) {
            System.out.println (n1.substring (1));
        } else
            System.out.println (n1);
    }
}