package repl;

import java.util.Scanner;

public class HWMethodsSign {
    //a sign function is simple, its gets a number and tells you if its positive, negative or zero.
    //sign gets an int parameter.
    //
    //print out 1,-1 or 0 depending on the input

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        // method
        sign(n);

    }

    public static void sign(int n){
        //your code here

        if (n<0){
            System.out.println("-1");
        } if (n==0) {
            System.out.println("0");
        } if (n>0){
            System.out.println("1");

        }

    }

}
