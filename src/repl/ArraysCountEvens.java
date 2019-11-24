package repl;

import java.util.Scanner;

public class ArraysCountEvens {
    public static void main(String[] args) {

        //Given an array nums, calculate count of even numbers in nums and print out to console.

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
