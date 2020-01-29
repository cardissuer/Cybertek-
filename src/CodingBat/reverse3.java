package CodingBat;

import java.util.Arrays;

public class reverse3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3( new int [] {1,2,3,4,5})));
    }

    public static int[] reverse3(int[] nums) {
        int [] reverse = new int [nums.length];
        for (int i=nums.length-1, j=0; i>=0;i--,j++){
            reverse[j] = nums [i];
        } return reverse;
    }
}