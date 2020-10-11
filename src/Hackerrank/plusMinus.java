package Hackerrank;

import java.text.DecimalFormat;

public class plusMinus {

    public static void main(String[] args) {
        plusMinus(new int [] {1,1,0,-1,-1});
    }

    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int item: arr){
            if (item>0) pos+=1;
            if (item<0) neg+=1;
            else if (item == 0) zero+=1;
        }
        pos = pos/arr.length;
        neg = neg/arr.length;
        zero = zero/arr.length;

        System.out.println(df.format(pos));
        System.out.println( df.format(neg));
        System.out.println (df.format(zero));

//        String res = pos + "\n" + neg + "\n" + zero;
//        System.out.printf("\n%.6f", String.valueOf(pos));
//        System.out.printf("\n%.6f", String.valueOf(neg));
//        System.out.printf("\n%.6f", String.valueOf(zero));
//        return posit + "\n" + negat + "\n" + zerot;
//        return res;
    }
}