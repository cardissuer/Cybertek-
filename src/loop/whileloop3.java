package loop;

import java.util.Scanner;

public class whileloop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = input.nextInt();
        int start=0;
            while (num > 0 && start<num) {
                System.out.println(start += 1);
            }
        }
    }
