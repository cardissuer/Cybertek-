package IfElseStatements;

/*public class Examples
{
    public static void main(String[] args) {
    if (4 == 5) {
        System.out.println("Ok then");
    }
    else {
        System.out.println("Thank u");
    }
}}*/

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int multi = num * 1;
        System.out.println (num + " * " + 1 + " = " + multi);
        multi = num * 2;
        System.out.println (num + " * " + 2 + " = " + multi);
        multi = num * 3;
        System.out.println (num + " * " + 3 + " = " + multi);
        multi = num * 4;
        System.out.println (num + " * " + 4 + " = " + multi);
        multi = num * 5;
        System.out.println (num + " * " + 5 + " = " + multi);
        multi = num * 6;
        System.out.println (num + " * " + 6 + " = " + multi);
        multi = num * 7;
        System.out.println (num + " * " + 7 + " = " + multi);
        multi = num * 8;
        System.out.println (num + " * " + 8 + " = " + multi);
        multi = num * 9;
        System.out.println (num + " * " + 9 + " = " + multi);
        multi = num * 10;
        System.out.println (num + " * " + 10 + " = " + multi);
    }
}
