package Arrays;

import java.util.Arrays;

public class IntegerArrayBinarySearch1 {
    public static void main(String[] args) {
        int [] num = {45,23,6,-3,66};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("Index of 7 is " + Arrays.binarySearch (num, 7));
    }
}
