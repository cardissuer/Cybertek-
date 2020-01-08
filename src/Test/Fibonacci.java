package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the range");
        int n = scanner.nextInt();
        scanner.nextLine();
        int num1 = 0;
        int num2 = 1;
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = num1;
            int sum = num1 + num2; //3
            num1 = num2; //2
            num2 = sum; //3
        }
        System.out.println(Arrays.toString(arr));
    }
}
