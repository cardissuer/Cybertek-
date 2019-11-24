package Arrays;

import java.util.Arrays;

public class IntegerArrayCombineTwoArrays {
    public static void main(String[] args) {

        //Given you have two arrays with values of:
        //    3,2,6,43,7,20 and 2,7,-10,10,-5,2
        //    Write a program that adds each element and stores them into a new array. Print the final array

        int [] row1 = {3,2,6,43,7,20};
        int [] row2 = {2,7,-10,10,-5,2,0};
        int [] sum = new int [row1.length];

        int small, big;
        boolean same = false;

        for (int i=0; i<row1.length; i++) {
            sum[i] = row1[i] + row2[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}