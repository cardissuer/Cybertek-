package Objects;

import java.util.Scanner;

public class ItemSearch {

    //Create a class Item that has instance variables name and price.
    //Create a constructor that sets both the name and the price.
    //Create a method that will print the name of the item and the price
    //Create a program that will ask user to enter how many items they have. Ask from the user to enter all the names and prices of each item. Make an Item array that will hold all the items.
    //After you have the array loop through it and print the information of all the items

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many items do you have: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        Item [] items = new Item [amount];

        for (int i=0; i<items.length;i++){
            System.out.println("Please enter the name of " + (i+1) + " item");
            String name = scanner.nextLine();
            System.out.println("Please enter the price of " + (i+1) + " item");
            double price = scanner.nextDouble();
            scanner.nextLine();
            items[i] = new Item (name, price);
        }
        for (Item everyItem: items){
            System.out.println();
            everyItem.info();
        }
    }
}