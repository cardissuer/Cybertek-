package CodingBat;

import java.util.Arrays;

public class fizzArray3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray3(5,10)));
    }

    public static int[] fizzArray3(int start, int end) {
        int len = end-start;
        int [] arr = new int [len];
    for (int i=0; i<len;i++){
        arr[i] = start;
        start++;
    }
        return arr;
    }
}
