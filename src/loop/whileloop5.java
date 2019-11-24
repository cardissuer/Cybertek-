package loop;

import java.util.Scanner;

public class whileloop5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amt = 1500;
        int transBal;
        while (amt>0) {
            System.out.println ("Please enter transaction amount");
            transBal = input.nextInt();
            if (transBal<=amt) {
                System.out.println("Item purchased");
                amt -= transBal;
            } else {
                System.out.println("Card is declined");
            }
        }
        System.out.println("You are broke");
            }
}
