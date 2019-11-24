package Random;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println("guess a number from 0 to 10");
        int num = input.nextInt();
        System.out.println(number);

        if (number == num) {
            System.out.println("Congrats you guess it right");
        } else if (number > num) {
            System.out.println("your guess is too low");
        } else if (number < num) {
            System.out.println("your guess is too high");
        } else
            System.out.println("it's bullshit");
    }
}