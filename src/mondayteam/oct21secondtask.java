package mondayteam;

import java.util.Scanner;

public class oct21secondtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter calls amount");
        int numberOfCall = input.nextInt();
        double bill = 0;
        if (numberOfCall <= 100) {
            bill = 200;
    }else if (numberOfCall > 100 && numberOfCall <= 150) {
            bill = (200.0 + (numberOfCall-100) * 0.6);
        } else if (numberOfCall > 150 && numberOfCall <= 200) {
            bill = (200.0 + (50* 0.6) + ((numberOfCall-150) * 0.5));
        } else if (numberOfCall > 200) {
            bill = (200.0 + (50 * 0.6) + (50 * 0.5) + ((numberOfCall-200) * 0.4));
        }
            System.out.println("Your bill is $" + bill);
        }
    }
