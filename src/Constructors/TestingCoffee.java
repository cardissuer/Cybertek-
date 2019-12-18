package Constructors;

public class TestingCoffee {

    public static void main(String[] args) {
        /*Coffee c1 = new Coffee();
        c1.type = "Cappucino";
        System.out.println("size is" + c1.size);
        System.out.println("type is" + c1.type);
        System.out.println("with Milk" + c1.withMilk);
        System.out.println("with Sugar" + c1.withSugar);
        System.out.println("char" + c1.C);
        System.out.println();

        Coffee c2 = new Coffee("Latte");
        System.out.println("size is" + c2.size);
        System.out.println("type is" + c2.type);
        System.out.println("with Milk" + c2.withMilk);
        System.out.println("with Sugar" + c2.withSugar);
        System.out.println("char" + c2.C);
        System.out.println();*/

        Coffee c3 = new Coffee("Espresso", false, true);
        System.out.println("size is" + c3.size);
        System.out.println("type is" + c3.type);
        System.out.println("with Milk" + c3.withMilk);
        System.out.println("with Sugar" + c3.withSugar);
        System.out.println("char" + c3.C);
        System.out.println();

        Order order1 = new Order (c3);
        System.out.println(order1.quantity);
        System.out.println(order1.size);
        System.out.println(order1.coffee);
    }
}