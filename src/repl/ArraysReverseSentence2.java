package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";

        //Given a String variable sentence,
        // write code to get each word and assign to String reversed in reverse order.

        String [] arr = sentence.split(" ");
        for (int i=arr.length-1;i>=0;i--) {
            reversed+= arr[i] + " ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);
    }
}