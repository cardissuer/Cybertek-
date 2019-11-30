package repl;

import java.util.Arrays;

public class HWMethodsWithArraysDeleteElementND {
        public static void main(String[] args) {
            int[] arr = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
            System.out.println (deleteR(arr,2));
        }
        //deleteR, gets an int array, and an int. the method returns an int array.
        //It removes element int from the array.
        //create a new arry for  return with -1 the length of arr
        //And add all elements from arr except for  the element that matches element value
        //return that new array
        public static int [] deleteR (int[] arr, int element) {
            int [] newarr = new int[arr.length-1];
            for (int i = 0,j=0; i < arr.length; i++) {
                if (arr[i]==element) {
                    continue;
                } newarr[j++] = arr[i];
            }
            System.out.println(Arrays.toString(newarr));
            return newarr;
        }
    }