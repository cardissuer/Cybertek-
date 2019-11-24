package stringmanipulation;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int am = str.indexOf("am") + 3; // "I am x years old"
        int years = str.indexOf("years");
        String age = str.substring(am, years-1);
        int ageNum = Integer.valueOf(age);
        ageNum+=5;
        System.out.println("in 5 years I will be " + ageNum);
    }
}
