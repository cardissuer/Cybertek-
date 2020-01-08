package switchStatements;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number from 1 to 7");
        int num = input.nextInt();
        String day = "";
        boolean valid = true;

        switch (num) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                System.out.println("Invalid day number");
                valid = false;
        }
        if(valid) {
            System.out.println(num + " is " + day);
        }
    }
}