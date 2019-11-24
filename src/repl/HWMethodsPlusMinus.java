package repl;

import java.util.Arrays;
import java.util.Scanner;

public class HWMethodsPlusMinus {
//Create a method called plus_minus that gets an array of ints (int[]),
// it outputs how many negative, positive and zero numbers are in the array.

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }

    // Create a method here and call it "plus_minus"

    public static void plus_minus(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives++;
            }
                if (arr[i] < 0) {
                    negatives++;
                }  if (arr[i] == 0) {
                        zeros++;
                    }
                }
        System.out.println("positives:" + positives + ",negatives:" + negatives + ",zeros:" + zeros);
    }
        }

