package CodingBat;

import java.util.Arrays;

public class maxEnd3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int [] {10,15,20})));
    }

    public static int[] maxEnd3(int[] nums) {
        int[] newArr = new int[nums.length];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = max;
        }
        return newArr;
    }
}
