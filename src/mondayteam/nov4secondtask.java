package mondayteam;

import java.util.Arrays;
import java.util.Scanner;

//An array inhabitants represents cities and their respective populations.
// For example, the following arrays shows 8 cities and their respective populations:
//[3, 6, 0, 4, 3, 2, 7, 1]
//Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
// After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.
//
//Write a program to loop though each city population and make it lose half of its population
// if it is adjacent(right or left) to a city with zero people until all cities have no humans left.
//
// Make updates to each element in the array And print the array like below for each day:

public class nov4secondtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int countZeros = 8;
        int countDays = 0;
        while (countZeros > 1) {
            countZeros = 8;
            System.out.println("Day " + countDays + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length - 1; i++) {
                if (inhabitants[i + 1] == 0) {
                    inhabitants[i] /= 2;
                    countZeros--;
                    continue;
                }
                if (inhabitants[i] == 0) {
                    inhabitants[i + 1] /= 2;
                    i++;
                    countZeros--;
                }
            }
            countDays++;
        }
        System.out.println("---- EXTINCT ----");
    }
}