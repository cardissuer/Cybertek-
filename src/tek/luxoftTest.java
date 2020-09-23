package tek;

import java.util.HashMap;
import java.util.Map;

public class luxoftTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2};
        System.out.println((duplicatedNumber(arr)));
    }

    //Given a non-empty array of integers, every element appears once except for one element which appears twice. Find that element.
//        Example 1:
//        Input: [1,2,5,4,3,8,7,12,11,13,6,8,22,15,9]
//        Output: 8
    public static int duplicatedNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public static int duplicatedNumber1(int[] nums) {

        Map <Integer, Integer> newMap = new HashMap<>();

        for (Integer num: nums){
            if (newMap.containsKey(num)){
                newMap.put (num, newMap.get(num)+1);
            } else {
                newMap.put (num,1);
            }
        } return 0;
    }

    }

