package mondayteam;

import java.util.Scanner;

public class oct28thirdtask {
    public static void main(String[] args) {

        //Write a program to prompt the user to enter the numbers till the user wants
        // (by asking user if he wants to continue) and at the end it should display the count of positive,
        // negative and zeros entered. (Hint: use do while loop)
        //	Example:
        //        Input:
        //	Enter the number: 9
        //	Do you want to continue y/n? y
        //	Enter the number: -5
        //	Do you want to continue y/n? y
        //	Enter the number: 0
        //	Do you want to continue y/n? y
        //	Enter the number: 66
        //	Do you want to continue y/n? n
        //
        //        Output:
        //	Positive numbers: 2
        //	Negative numbers: 1
        //	Zero numbers:

        Scanner input = new Scanner(System.in);
        int pos = 0;
        int zero = 0;
        int neg = 0;
        String ans = "";
        do {
            System.out.println("Enter the number: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
            ans = input.nextLine();
            if (ans.equals("y")) {
                if (num > 0) {
                    pos++;
                } else if (num < 0) {
                    neg++;
                } else{
                        zero++;
                    }
                }
            } while (ans.equalsIgnoreCase("y"));

            System.out.println("Positive numbers: " + pos);
            System.out.println("Negative numbers: " + neg);
            System.out.println("Zero: " + zero);
        }
    }
