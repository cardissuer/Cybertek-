package repl;

import java.util.Scanner;

public class HWMethodsiPos {
    //isPos is a method that checks if  an int positive or not positive
    //
    //1. If  the int num is positive print positive else print not positive
    //
    //2. Complete main method by calling isPos method for each element in the array arr.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();

        }

for (int i=0; i<size;i++){
    System.out.println (isPos(arr[i]));
}

    }

    public static String isPos(int num) {
    String pos = "positive";
    String neg = "not positive";
        if (num<0) {
        return neg;
    } else {
        return pos;
    }
}
    {

    }

    }