package Rebootcamp;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(Arm(153));
        System.out.println(Arm2(153));
    }

    public static boolean Arm (int num) {
        String numb = String.valueOf(num);
        int power = numb.length();
        int sum = 0;
        for (int i=0; i<power; i++){
            int digit = Integer.parseInt(""+numb.charAt(i));
            sum+=Math.pow(digit,power);
        }
        return sum == num;
    }

    public static boolean Arm2 (int num){
        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();
        while (digits!=0){
            int each = digits%10;
            digits/=10;
            sum+=Math.pow(each,power);
        }
        return sum == num;
    }
}
