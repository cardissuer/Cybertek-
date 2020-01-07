package Polymorphism;

public class Park {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd();
        String s = dog.type;

        Trainable dog2 = (Trainable) new GermanShepherd();
        String name = dog2.name;
    }
}
