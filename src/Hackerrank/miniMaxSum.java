package Hackerrank;

import java.util.Arrays;

public class miniMaxSum {

    public static void main(String[] args) {
        miniMaxSum(new int[]{10,12,18,16,14});
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
