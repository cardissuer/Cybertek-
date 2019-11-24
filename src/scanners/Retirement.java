package scanners;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter you current age: ");
        int age = input.nextInt();
        int retire = 65;
        int result = retire - age;
        System.out.println("Because you are " + age + " years old so you will retire in " + result + " years");

    }
}
