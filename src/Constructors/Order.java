package Constructors;

public class Order {
    Coffee coffee;
    int size;
    int quantity = 0;
    boolean withMilk;

    public Order (){
        quantity++;
    }

    public Order (Coffee coffee){
        this.coffee = coffee;
        quantity++;
    }
}