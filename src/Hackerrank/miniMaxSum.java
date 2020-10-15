package Hackerrank;

import java.util.Arrays;

public class miniMaxSum {

    public static void main(String[] args) {
        miniMaxSum(new int[]{1,2,3,4,5});
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int min=0, max = 0;
        for (int i=0; i<arr.length-1;i++){
        min+=arr[i];
        }
        for (int i=1; i<arr.length;i++) {
            max += arr[i];
        }
        System.out.print(min + " " + max);
        }
    }
