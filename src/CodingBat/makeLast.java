package CodingBat;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        System.out.println (Arrays.toString(makeLast(new int[] {2,3,4,5,6})));
    }
    public static int[] makeLast(int[] nums) {
        int [] newArr = new int [(nums.length)*2];
        newArr [nums.length*2-1] = (nums.length)*2;
        return newArr;
    }
}
