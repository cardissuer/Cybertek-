package repl;

import javax.swing.*;
import java.util.Scanner;

public class TheSumOfFollowingSeries {
    public static void main(String[] args) {

        //Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

   /*     Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0.0;
        while (n>0) {
        res= res+ (double)1/n;
        n--;
        }
        System.out.println(res);
    }
}*/
        Scanner input = new Scanner(System.in);
        int number_by_user = input.nextInt();
        double s = 0.0;
        for (int i = 1; i <= number_by_user; i++) {
            s = s + (double) 1 / i;
        }
        System.out.println(s);
    }
}