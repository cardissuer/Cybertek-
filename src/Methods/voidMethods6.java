package Methods;

import java.util.Scanner;

public class voidMethods6 {
    public static void main(String[] args) {

        //Create a method that accepts String and int.
        //Check if string length is same as given integer.
        //Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
        numberOfSymbols("home", 5);
    }
    public static void numberOfSymbols (String word, int num) {
        if (word.length()== num) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}