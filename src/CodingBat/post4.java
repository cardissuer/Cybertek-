package CodingBat;

import java.util.Arrays;

public class post4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(post4(new int [] {1,2,3,4,5,6,7,8,9})));
    }

    public static int[] post4(int[] nums) {
        int len = nums.length - 1;
        int[] res;
        while (nums[len] != 4) len--;
        res = new int[nums.length - 1 - len];
        for (int i = len + 1; i < nums.length; i++) {
            res[i - len - 1] = nums[i];
        }
        return res;
    }
}
