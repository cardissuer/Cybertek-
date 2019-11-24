package Methods;

import java.util.Arrays;

public class returnMethods10 {

    //Given a String of numbers. Return the difference between the biggest and smallest number

    public static void main(String[] args) {
        System.out.println(differNums("8579563603056"));
    }

    public static int differNums (String nums) {
        String [] arr = nums.split("");
        Arrays.sort(arr);
        return Integer.valueOf(arr[arr.length-1]) - Integer.valueOf(arr[0]);
            }
}
