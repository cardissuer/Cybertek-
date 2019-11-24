package Arrays;

import java.util.Arrays;

public class StringArraySplit {
    public static void main(String[] args) {
        String str1 = "Apple Orange Banana";
        String str2 = "ABBA";
        String [] arr1 = str1.split(" ");
        System.out.println(Arrays.toString(arr1));
        String [] arr2 = str2.split("");
        System.out.println(Arrays.toString(arr2));
    }
}
