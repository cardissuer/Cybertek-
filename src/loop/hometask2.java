package loop;

import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int num = input.nextInt();
        for (int num2 = 0; num2 < 11; num2 += 1) {
            System.out.println(num + "*" + num2 + "=" + (num * num2));
        }
    }
}
