package repl;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        //Ask user to enter a new password. If the password does not match any of the requirements below, print a message based on what requirement it is breaking. If it does not break any requirement, print ‘Password accepted’.
        //
        //
        //
        //Password requirements:
        //
        //Be a minimum of eight (8) characters in length
        //
        //Contain at least one uppercase letter (A-Z)
        //
        //Contain at least one lowercase letter (a-z)
        //
        //Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
        //
        //Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
        //
        //
        //
        //Input:
        //oxidex
        //Output:
        //Password should contain minimum 8 characters
        //
        //Input:
        //abcdefghi
        //Output:
        //Password should contain at least 1 uppercase number
        //
        //Input:
        //ABCDEFGHI
        //Output:
        //Password should contain at least 1 lowercase number
        //
        //Input:
        //Abcdefghi
        //Output:
        //Password should contain at least 1 digit
        //
        //Input:
        //Abcdefghi1
        //Output:
        //Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
        //
        //Input:
        //Abcdefghi1$
        //Output:
        //Your password is accepted

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        boolean accept = true;
        if (n1.length() < 8)
        {
            System.out.println("Password should contain minimum 8 characters");
            accept = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!n1.matches(upperCaseChars ))
        {
            System.out.println("Password should contain at least 1 uppercase number");
            accept = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!n1.matches(lowerCaseChars ))
        {
            System.out.println("Password should contain at least 1 lowercase number");
            accept = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!n1.matches(numbers ))
        {
            System.out.println("Password should contain at least 1 digit");
            accept = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!n1.matches(specialChars ))
        {
            System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.");
            accept = false;
        }
        if (accept)
        {
            System.out.println("Your password is accepted");
        }
    }
}