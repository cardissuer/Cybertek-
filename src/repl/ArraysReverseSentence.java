package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseSentence {
    public static void main(String[] args) {
        //Given a String variable sentence,
        // write code to type each word in separate lines in a reverse order.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sentence = input.nextLine();
        String [] arr = sentence.split(" ");
        for (int i=0; i<arr.length/2;i++) {
            //System.out.print (arr[i] + " ");
            String temp = arr[i];
            arr [i] = arr [arr.length-1-i];
            arr [arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
