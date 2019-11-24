package mondayteam;

import java.util.Scanner;

public class oct21fourthtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two words");
        String sentence = input.nextLine();
        int length = sentence.length()-1;
        int space = sentence.indexOf(" ");
        String part1 = sentence.substring(0,1);
        part1 = part1.toUpperCase();
        String part2 = sentence.substring(1,space);
        String part3 = sentence.substring(space+1,space+2);
        part3 = part3.toUpperCase();
        String part4 = sentence.substring(space+2);
        System.out.println(length);
        System.out.println(part1 + part2 + " " + part3 + part4);
    }
}
