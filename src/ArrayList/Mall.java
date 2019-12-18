package ArrayList;

import Objects.Item;

public class Mall {
    public static void main(String[] args) {
        Store zara=new Store ("Zara", "312 Main st");
        Item Item1 = new Item("Socks", 15);
        Item Item2 = new Item ("Coat", 85);
        Item Item3 = new Item ("T-shirt", 25);

        zara.addItem(Item1);
        zara.addItem(Item2);
        zara.addItem(Item3);

        //System.out.println(zara.numberOfItems);
        //zara.seeInventory();

        //zara.addItem();
        //zara.seeInventory();
        //zara.sellItem("Coat");
        //zara.seeInventory();
        //System.out.println(zara.totalSales);
        zara.returnItem("Jeans");
        System.out.println(zara.totalSales);
    }
}