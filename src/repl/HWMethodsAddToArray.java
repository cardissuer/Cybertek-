package repl;

import java.util.Arrays;
import java.util.Scanner;

public class HWMethodsAddToArray {
    public static void main(String[] args) {
//add_to_r is a method that gets an array and a number.
//
//the method creates a new array bigger by one then (int[] r).
//It populates the new array with the old ones(r) values.
//and finally in the last position adds the number (int n) to it.

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position

        int[] new_r = new int [r.length+1];
        for (int i=0; i<new_r.length;i++){
            if (i==new_r.length-1){
                new_r[i] = n;
            }else {
                new_r[i] = r[i];
            }
        }
        System.out.println(Arrays.toString(new_r));
    }
}