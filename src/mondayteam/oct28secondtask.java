package mondayteam;

import java.util.Scanner;

public class oct28secondtask {
    public static void main(String[] args) {

        //Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
        //Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
        //Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)
        //
        //Input: av$5yit8
        //Output: 58
        //
        //Input: abc23fd5hk7
        //Output: 2357

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the expression");
        String str2 = input.nextLine();
        String numbers = "";
        if (str2.length()< 3 || str2.length()> 100) {
            System.out.println("Invalid entry");
        } else
            for (int i=0; i < str2.length();i++) {
                if (str2.charAt(i)>=48 && str2.charAt(i)<=57) {
                    numbers +=str2.charAt(i);
                }
            } System.out.print(numbers + " ");
    }
}