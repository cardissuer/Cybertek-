package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassOne {

    public static void main(String[] args) {
        try {
            String s = "hello";
            System.out.println(s.charAt(1));
            System.out.println(3/0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }catch (Exception e){
            System.out.println("Ariphmetic error");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = input.nextLine();
            int age = 0;
            try{
                System.out.println("Enter your age");
                age = input.nextInt();

            }catch (InputMismatchException a) {
                System.out.println("Invalid age entered");
            }
            System.out.println("Name " + name);
            System.out.println("Age " + age);
    }
}
}