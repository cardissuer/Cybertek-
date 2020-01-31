package CodingBat;

import java.util.Arrays;

public class start1 {
    public static void main(String[] args) {
        System.out.println((start1((new int[]{0, 2, 3}), (new int[]{}))));
        System.out.println(Arrays.toString(makeMiddle(new int[]{4, 4})));
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if ((a.length == 0 && b[0] == 1) || (a[0] == 1 && b.length == 0)) {
            return count = 1;
        }
        if (a.length > 0 && b.length > 0 && (a[0] == 1 || b[0] == 1)) {
            return count = 1;
        }
        if ((a.length > 0 && b.length > 0) && (a[0] == 1 && b[0] == 1)) {
            return count = 2;
        }
        return count;
    }

    public static int[] makeMiddle(int[] nums) {
        if (nums.length > 2) return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
        return nums;
    }

    public static boolean unlucky1(int [] nums) {
        if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) return true;
        return false;
    }
}
