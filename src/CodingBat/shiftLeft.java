package CodingBat;

import java.util.Arrays;

public class shiftLeft {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftLeft(new int[]{2, 3, 4, 5, 6})));
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length != 0) {
            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
}
