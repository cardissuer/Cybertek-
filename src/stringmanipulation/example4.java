package stringmanipulation;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        String sen = "We will have a picnic when the weather gets nicer";
        System.out.println(sen);
        System.out.println("Please enter two characters: first one that you wanna change, second one that you gotta input in sentence ");
        Scanner input = new Scanner(System.in);
        String change = input.nextLine();
        String newone = input.nextLine();
        System.out.println(sen.replace (change,newone));
    }
}
