package IfElseStatements;

import java.util.Scanner;

public class Campustime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter the time you are checking: ");
        boolean check;
        int time = input.nextInt();
        if (time >= 8 && time <= 23) {
            check = true;
            } else {
            check = false;
        }
    if (check) {
        System.out.println ("Open");
    } else {
        if (time < 0 || time >= 24) {
            System.out.println("Invalid time");
        } else {
            System.out.println("Closed");
        }
    }

    }

}
