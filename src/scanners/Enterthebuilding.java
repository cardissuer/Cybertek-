package scanners;

import java.util.Scanner;

public class Enterthebuilding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age >= 30 && age <100) {
            System.out.println("Welcome to the building");
        } else if (age>0 && age <30) {
            System.out.println("Sorry try again when you're 30");
        }else {
            System.out.println("Not a valid age");
        }
    }
}
