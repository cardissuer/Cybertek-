package repl;

import java.util.Arrays;
import java.util.Scanner;

//The matrix movie producers want all the green text to be 01010101
//
//They already made a few arrays of string to run but they have other strings that are not 0101
//
//loop the array and fix it.
//
//Basically, you get a 2d array with strings, you must make sure all the values are 0,1,0,1
//hint use modulo (%) operator to get every second iteration: like
//
// if (j % 2 == 0){/*do something*/}
//
//only strings are used no ints its "1" and "0".

public class twoDArraysErrorInTheMatrixND {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        String[][] arr = new String[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.next();
            }//end for cols
        }//end for rwos


        //your code here


        System.out.println( Arrays.deepToString(arr) ) ;
    }//end main
}