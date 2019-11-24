package Strings;

import java.util.Random;
import java.util.Scanner;

public class Homework {
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "test";
        String pass = "test123";
        System.out.println("Please enter username");
        String name = input.nextLine();
        if (name.equals(user)) {
            System.out.println("Please enter password");
            String pass1 = input.nextLine();
            if (pass1.equals(pass)) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Invalid password");
            }

            } else {
                System.out.println("Invalid username");
        }
        }
    }*/

  public static void main(String[]args){
       Scanner input = new Scanner(System.in);
        Random random = new Random();
       System.out.println("Please enter your message: ");
       String msg = input.nextLine();
       if (msg.length() >= 15) {
           System.out.println("Sent");
        int number = random.nextInt(10);

        if (number % 2 == 1) {
            System.out.println("Delivered");
        } else {
            System.out.println("Not delivered");
        }
           } else {
           System.out.println("Not sent");
       }
   }
   }

