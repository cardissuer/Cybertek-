package InheritancePart2;

public class Laptop {

    String model;
    int memorySize;
    protected String color;

    public void turnOn() {
        System.out.println("The laptop is turned on");
    }

    public Laptop(String model) {
        this.model = model;
        System.out.println("Laptop is super");
        System.out.println("Laptop model is: " + model);
        System.out.println("Laptop memory size is: " + memorySize);
    }
}