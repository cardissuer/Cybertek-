package Objects;

import java.util.Scanner;

public class Flag {

    String country;
    int size;
    String color;
    String material;

    public void info() {
        System.out.println("Country: " + country);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }

    public void flap(){
        System.out.println("Flag is flapping");
    }

//create a method called upgrade
//method should accept int for size and String for material
//method upgrade should reassign the current size and material with given new values

public void upgrade (int size, String material) {
    this.size=size;
    this.material=material;
}
}