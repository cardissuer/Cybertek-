package InheritancePart2;

public class MacBook extends Laptop {

    public MacBook() {
        super("Apple");
    }

    public int numOfLaptops() {
        return super.memorySize;
    }

    public static void main(String[] args) {
        MacBook macbook = new MacBook();
        macbook.color = "Grey";
        System.out.println();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void appleID(){
        super.model = "X";
    }
}