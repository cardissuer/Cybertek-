package Arrays;

import java.util.Arrays;

public class IntegerArrayFindBiggestValues {
    public static void main(String[] args) {

        //Given an array of values: 23, 1, 34, 3, 54, 54, 51
        //Print the biggest two values. Only Unique values
        //> The result here should be:
        //54
        //51

        int [] nums = {23, 1, 34, 3, 54, 54, 51};
        Arrays.sort(nums);

        String check = "";
        int count = 0;
        for (int i=nums.length-1; i>=0;i--) {
            if (count==2){
                break;
            }
            if (check.contains(nums[i] + " "))
                System.out.println(nums[i]);
            check+=nums[i] + " ";
            count++;
        }
    }
}
