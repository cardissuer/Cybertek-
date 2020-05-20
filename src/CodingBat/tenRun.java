package CodingBat;

import java.util.Arrays;

public class tenRun {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tenRun(new int [] {10,2,3,4,5,30,7,6,5})));
    }

    public static int[] tenRun(int[] nums) {
    for (int i=0;i<nums.length-1;i++){
        if (nums[i]%10==0&&nums[i+1]%10!=0){
            nums[i+1]=nums[i];
        } else nums[i+1]=nums[i+1];
    } return nums;
    }

}
