package CustomExceptions;

public class Store {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        try {
                laptop.setOs("McFerrano");
                laptop.turnOn();
            } catch (InvalidOsException | LaptopNotTurningOnException e){
            e.printStackTrace();
        }
    }
}
