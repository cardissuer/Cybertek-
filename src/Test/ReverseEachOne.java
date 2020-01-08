package Test;

import java.util.Scanner;

public class ReverseEachOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence = scanner.nextLine();
        String [] arr = sentence.split(" ");
        for (String ar : arr){
            for (int i=ar.length()-1;i>=0;i--){
                System.out.print(ar.charAt(i));
            }
           System.out.print(" ");
        }
    }
}
