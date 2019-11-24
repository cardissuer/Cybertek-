package repl;

import java.util.Arrays;

public class HWMethodsWithArraysAddElements {
    public static void main(String[] args) {
//Method addElements accepts 2 int arrays and adds each element value of two arrays and returns
// a new array. You can assume that each array has 5 elements
        int [] a={10,20,30,40,50};
        int [] b={100,200,300,400,500};
        System.out.println (Arrays.toString(addElements(a,b)));
    }
    public static int[] addElements(int[] ints1, int[] ints2) {
    int [] ints3 = new int [ints1.length];
        for (int i=0; i<ints1.length;i++){
        ints3 [i] = ints1[i] + ints2[i];
}
        return ints3;
    }
}