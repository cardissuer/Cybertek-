package scanners;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println ("Day: ");
        int day = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();
        String result = "" + month + "/" + day + "/" + year;
        System.out.println(result);
        day-=1;
        year+=5;
        String result1 = "" + month + "/" + day + "/" + year;
        System.out.println(result1);
    }
}
