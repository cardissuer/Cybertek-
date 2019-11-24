package repl;

import java.util.Scanner;

public class Arraysconvertbinarytodecimal {
    public static void main(String[] args) {
        int check = 0;
        //Given an array binary with 8 integers (0s or 1s), write java program
        // to calculate decimal value and print out to console. Feel free to use additional arrays or formulas.

        Scanner input = new Scanner(System.in);
        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
            int n = 0;
            if (binary[i]!=0) {
                check += ((binary[i] % 10) * Math.pow(2, n));
                binary[i] = binary[i]/10;
                n++;
            }
        }
        System.out.println(check);
    }
}