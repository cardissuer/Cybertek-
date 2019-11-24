package mentorings;

import java.util.Scanner;

public class codingBatString1helloName {
    public static void main(String[] args) {

        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String hello = "Hello";
        System.out.println(hello + " " + name + "!");
    }
}
