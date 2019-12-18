package exercise;

//Fibonacci Create a method that will accept a number (int).
// Return a String with each Fibonacci number separated by a space.
// The amount of Fibonacci numbers in the String is determined by the given number
// Ex: > input: 10 > output: 0 1 1 2 3 5 8 13 21 34

import java.util.Arrays;

public class FibonacciNumber {

    public static String FibonacciNumbers (int number){
        int [] arr = new int [number];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i<arr.length;i++){
            arr[i] = arr[i-1] + arr [i-2];
        }
        String str = Arrays.toString(arr);
        return str.substring(1,str.length()-1).replace(",","").replace("[","").replace("]", "");
    }

    public static void main(String[] args) {
        System.out.println(FibonacciNumbers(10));
    }
}
