package stringmanipulation;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the month");
        String month = input.nextLine();
        String mlow = month.toLowerCase();
        String month1 = "february";
        boolean check = mlow.equals (month1);
        System.out.println(check);
    }
}
