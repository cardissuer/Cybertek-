package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConvertDecimaltobinary {
    public static void main(String[] args) {

        //Given an int variable decimal,  write java program to calculate binary value of the decimal variable and
        // assign it binary array. print out value of binary array matching below format.
        // Feel free to use additional arrays or formulas.

            Scanner input = new Scanner(System.in);
            int decimal = input.nextInt();
            int[] binary = new int[8];

        for(int i = 0;i <binary.length;i++) {
            binary[i] = (decimal%2);
            decimal = decimal/2;
        }
        System.out.println(Arrays.toString(binary));
    }
    }