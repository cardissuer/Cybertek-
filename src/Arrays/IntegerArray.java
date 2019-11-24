package Arrays;

import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
        int [] nums = new int [5];
        nums[0] = 4;
        nums [1] = 3;
        nums [2] = 6;
        nums [3] = 10;
        nums [4] = 15;
        nums [2] = nums [2] +1;
        nums [3] = nums[0] + nums[1];
        System.out.println(nums[2] + 1);
        System.out.println(Arrays.toString(nums));
    }
}
