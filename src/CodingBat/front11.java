package CodingBat;

import java.util.Arrays;

public class front11 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString (front11(new int[]{}, new int [] {})));
    }

    public static int[] front11(int[] a, int[] b) {
        int[] newarr = new int[2];
        int[] newarr1 = new int[1];
        if (a.length >= 1 && b.length >= 1) {
            newarr[0] = a[0];
            newarr[1] = b[0];
            return newarr;
        }
        if (a.length == 1 && b.length == 0) {
            newarr1[0] = a[0];
            return newarr1;
        }
        if (a.length == 0 && b.length == 1) {
            newarr1[0] = b[0];
            return newarr1;
        }
        return newarr;
    }
}

