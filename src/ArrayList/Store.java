package ArrayList;

import Objects.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> items = new ArrayList<>();

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addItem(Item Item) {
        this.items.add(Item);
        this.numberOfItems++;
    }
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
        public void seeInventory () {
            for (Item item : items) {
                item.info();
            }
            }
        }