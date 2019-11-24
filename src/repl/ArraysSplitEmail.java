package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitEmail {
    public static void main(String[] args) {

        //Given a String variable email, write code using split method to print email id and domain in separate lines.
        //If email contains no @ character or multiple @ characters then print invalid email:

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String [] parts = email.split("@");
        if (parts.length<3 && email.contains("@")) {
            System.out.println("Email id: " + parts [0]);
            System.out.println("Email domain: " + parts [1]);
        } else
            System.out.println("invalid email");
    }
}