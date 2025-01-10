package Constructors;

public class Latte extends Coffee {

    public Latte(String type, boolean milk, boolean sugar) {
        super(type, milk, false);
    }

    public void say (){
        System.out.println("Milk in latte: " + withMilk);
    }
}
