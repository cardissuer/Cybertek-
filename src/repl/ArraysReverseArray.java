package repl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseArray {
    public static void main(String[] args) {
        //Given an array nums with 7 integers already assigned, write code to reverse it.
        //Do not use any additional arrays or Strings.
        //PseudoCode:
        //
        //1. Take values at index 0 and last index and swap them
        //2. Take values at index 0+1 and last index-1 and swap them
        //3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int len = nums.length-1;
    for (int i=0;i<nums.length/2;i++){
        int temp=nums[i];
        nums[i]=nums[len-i];
        nums[len-i]=temp;
    }
        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}