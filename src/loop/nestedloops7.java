package loop;

import java.util.Scanner;

public class nestedloops7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum=0;
        double avg = (num2-num1);
        for (int i=num1; i<num2;i++) {
            sum+=i;
        }
        System.out.println("Sum of all numbers within the range is: " + sum);
        System.out.println("Average" + sum/avg);
    }
}