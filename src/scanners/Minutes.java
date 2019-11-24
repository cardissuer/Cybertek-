package scanners;

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter minutes amount: ");
        int minutes = input.nextInt();
        int hrs = minutes / 60;
        int min = minutes % 60;
        System.out.println("Total minutes is " + hrs + " hours and " + min + " minutes");
    }
}
