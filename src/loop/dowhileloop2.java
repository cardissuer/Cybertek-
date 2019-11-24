package loop;

import java.util.Random;
import java.util.Scanner;

public class dowhileloop2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100+1);
        Scanner input = new Scanner(System.in);
        System.out.println("guess a number from 0 to 100");
        int num = input.nextInt();
        int count = 0;
        do {
        System.out.println(number);
        count+=1;
        if  (number > num) {
            System.out.println("your guess is too low");
        } else if (number < num) {
            System.out.println("your guess is too high");
        } else
            System.out.println("it's bullshit");
            System.out.println("guess a number from 0 to 100");
            num = input.nextInt();
    } while (number != num);
        System.out.println("You guessed right after " + count + " tries");
}
       }
