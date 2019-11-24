package mondayteam;

import java.util.Arrays;
import java.util.Scanner;

//An array inhabitants represents cities and their respective populations.
// For example, the following arrays shows 8 cities and their respective populations:
//[3, 6, 0, 4, 3, 2, 7, 1]
//Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
// After each day, every city will lose half of its population.
//write a program to loop though each city population and make it lose half of its population until all cities
// have no humans left. Make updates to each element in the array and print the array

public class nov4firsttask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        System.out.println ("Day 0" + " " + Arrays.toString(inhabitants));
        int day = 1;
        int sum = 0;
        for (int j = 0; j < inhabitants.length; j++) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum += inhabitants[i];
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                return;
            }
            sum = 0;
        }
    }
}