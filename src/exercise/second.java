package exercise;
import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        int a = input.nextInt();
        System.out.println("Please enter the second number: ");
        int b = input.nextInt();
        int count = 0;
        a+=b;
        count++;
        System.out.println("Your first number " + a + " after being incremented by second number " + b + " for " + count + " times" );
        a+=b;
        count++;
        System.out.println("Your first number " + a + " after being incremented by second number " + b + " for " + count + " times" );
        a+=b;
        count++;
        System.out.println("Your first number " + a + " after being incremented by second number " + b + " for " + count + " times" );
    }
}
