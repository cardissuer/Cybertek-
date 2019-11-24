package Arrays;

import java.util.Arrays;

public class IntegerArraySort1 {
    public static void main(String[] args) {

        //Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
        //Print out the biggest and smallest values in the array

        int [] nums = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort (nums);
        System.out.println("Min value is " + nums[0]);
        System.out.println("Max value is " + nums[nums.length - 1]);
    }
}
