package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArraysNamesInGroups {

    //reate a program that will ask the user to enter how many groups they have.
    // Then ask the user to enter how many students are in each group.
    // Allow the user to enter each name of the people in each group.
    // Print the 2D array of all the groups at the end

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter groups number");
        int groups = scanner.nextInt();
        scanner.nextLine();

        String [][] allGroups = new String[groups][];

        for (int i=0;i<groups;i++) {
            System.out.println("Please enter how many students in group" + (i+1));
            int numInGroup = scanner.nextInt();
            scanner.nextLine();

            String[]group = new String[numInGroup];

            for (int j=0; j<group.length;j++) {
                System.out.println("Enter name" + (j+1));
                group[j]=scanner.nextLine();
            }
            allGroups[i] = group;
        }
        System.out.println(Arrays.deepToString(allGroups));
    }
}