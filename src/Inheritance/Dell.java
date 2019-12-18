package Inheritance;

import InheritancePart2.Laptop;

public class Dell extends Laptop {

    public Dell (){
        super ("Inspiron");
    }

    public static void main(String[] args) {
        Dell dell = new Dell();
        dell.color = "Red";
    }
}