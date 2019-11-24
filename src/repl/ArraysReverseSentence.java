package repl;

import java.util.Scanner;

public class ArraysReverseSentence {
    public static void main(String[] args) {
        //Given a String variable sentence,
        // write code to type each word in separate lines in a reverse order.
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String [] arr = sentence.split(" ");
        for (int i=arr.length-1;i>=0;i--) {
            System.out.println (arr[i]);
        }
    }
}
