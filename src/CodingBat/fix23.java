package CodingBat;

import java.util.Arrays;

public class fix23 {

    public static void main(String[] args) {
        System.out.println (Arrays.toString(fix23((new int [] {1,2,3,4,5,6,7,8}))));
    }

    public static int[] fix23(int[] nums) {
        for (int i=1;i<nums.length;i++) {
            if((nums [i] == 3) && (nums [i-1] == 2)) {
                nums [i] = 0;
            }
        } return nums;
    }
}
