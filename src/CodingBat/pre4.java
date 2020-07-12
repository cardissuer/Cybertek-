package CodingBat;

import java.util.Arrays;

public class pre4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pre4(new int [] {1,2,3,4,5,6,7,8,9})));
    }

    public static int[] pre4(int[] nums)
    {
        int p = 0;
        int[] arr;
        while(nums[p] != 4)
            p++;
        arr = new int[p];
        for(int i = 0; i < p; i++)
            arr[i] = nums[i];
        return arr;
    }
}
