package Methods;

import java.util.Scanner;

////1- Print out the intro text
//        //2- Request username from the user
//        //3- Request password from the user
//        //4- Check if the expected username and actual username are matching
//        //5- Print out final message

public class GurhanLoginMethod {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String login = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        if (login.equalsIgnoreCase("JohnJava") && password.equals("123456")) {
            System.out.println("You have logged in!");
        } else {
            System.out.println("Either username or password is incorrect");
        }
    }
}