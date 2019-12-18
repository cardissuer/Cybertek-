package ArrayList;

import Objects.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> items = new ArrayList<>();
    double totalSales;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addItem(Item Item) {
        this.items.add(Item);
        this.numberOfItems++;
    }

    //Overload the method addItem.
    //Method doesn't take anything.
    //This method should ask user how many items to enter.
    //Method should ask Item name and price and add the Item to the items list based on the quantity user entered.
    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items do you need to add?");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the name of item: " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Enter the price of item: " + (i + 1));
            double price = scanner.nextDouble();
            scanner.nextLine();
            Item item = new Item(name, price);
            this.items.add(item);
            this.numberOfItems++;
        }
    }

    public void seeInventory() {
        System.out.println("\n Zara Chicago Store");
        System.out.println("Total sales: " + this.totalSales + " $ ");
        for (Item item : items) {
            item.info();
        }
    }
    //Modify Store class.
    //Add instance variable totalSales.
    //Create method sellItem. Method accepts name of the Item and doesn’t return anything.
    // Check if name of the item is in the list.
    // If it’s in stock remove from the list and add the price to totalSales and give success transaction message.
    // If doesn’t exist in the list give failed transaction message and terminate the method.

    //Create method returnItem. Method takes item name and doesn’t return anything.
    // Ask user to enter the price of an item. Then create Item object from given information and add to the items list.
    // Also maintain totalSales.

    public void sellItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(name)) {
                this.totalSales += items.get(i).price;
                items.remove(i);
                this.numberOfItems--;
                System.out.println("Transaction is successful");
                return;
            }
            }
        System.out.println("Transaction is declined");
        }
            public void returnItem (String name){
            System.out.println("Please enter the price of item: ");
            Scanner scanner = new Scanner(System.in);
            double price = scanner.nextDouble();
            Item item = new Item (name, price);
            items.add(item);
            this.totalSales-=price;
            this.numberOfItems++;
                System.out.println("\n Reversal is successful");
        }
}