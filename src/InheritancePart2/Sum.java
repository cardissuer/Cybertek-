package InheritancePart2;

class Sun {

    public static void main(String[] args) {
        MacBook macbook = new MacBook();
        macbook.model = "MacBook Air";
        macbook.memorySize = 512;
        macbook.color = "Grey";

        macbook.turnOn();
        macbook.toString();
        macbook.numOfLaptops();
    }
}