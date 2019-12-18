package repl;

import java.util.Arrays;

public class HWMethodsWithArraysMergeArrays {
    public static void main(String[] args){
        int [] a = {2,3,4,5};
        int [] b = {6,7,8,9};
        System.out.println(mergR(a,b));
    }
    //mergR merges two arrays into one.
    //it gets two int arrays and returns an int array
    //hint:
    //create a length int for the combined length of both arrays.
    //create an array with that length (thats the array we will return).
    //create an iterator for both arrays (int z=0).
    //
    //loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
    //then increment the iterator for both arrays (z++).
    //
    //do the same for the second array.

    public static int[] mergR(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] combine = new int[length];
        int z = 0;

        for (int i = 0; i < a.length; i++) {
            combine[z] = a[i];
            z++;
        }

        for (int i = 0; i < b.length; i++) {
            combine[z] = b[i];
            z++;
        }
        System.out.println(Arrays.toString(combine));
        return combine;
    }
}