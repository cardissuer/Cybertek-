package mondayteam;

import java.util.Scanner;

public class oct21firsttask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price: ");
        int price = input.nextInt();
        int change = 100-price;
        int quarter = change/25;
        int remainder = change%25;
        int dimes = remainder/10;
        int remainder2 = remainder%10;
        int nickels = (remainder2)/5;
        System.out.println("Your change is " + quarter + " quarters," + dimes + " dimes," + "and " + nickels + " nickels");
    }
}
